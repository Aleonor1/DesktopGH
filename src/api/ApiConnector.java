package api;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import api.RuntimeExec.StreamWrapper;

public class ApiConnector {

	@SuppressWarnings("unused")
	public static Map<String, String> searchRepos(String qToSearch, String language) {
		Runtime rt = Runtime.getRuntime();
		RuntimeExec rte = new RuntimeExec();
		StreamWrapper error, output = null;
		Map<String, String> jsonMap = new HashMap<>();
		String st = null;
		if (StringUtils.isBlank(language)) {
			st = "curl -X GET https://api.github.com/search/repositories?q=" + qToSearch.toLowerCase()
					+ "&sort=stars&order=desc";
		} else {
			st = "curl -X GET https://api.github.com/search/repositories?q=" + qToSearch.toLowerCase() + "language:"
					+ language + "&sort=stars&order=desc";
		}
		try {
			Process proc = rt.exec(st);
			error = rte.getStreamWrapper(proc.getErrorStream(), "ERROR");
			output = rte.getStreamWrapper(proc.getInputStream(), "OUTPUT");
			int exitVal = 0;
			error.start();
			output.start();
			error.join(3000);
			output.join(3000);
			exitVal = proc.waitFor();
			String outputMessage = output.message;
			outputMessage = StringUtils.normalizeSpace(outputMessage);
			outputMessage = outputMessage.replace("\"", "");
			outputMessage = outputMessage.replaceAll("[\\p{Ps}\\p{Pe}]", "");
			String[] lista = outputMessage.split(",");
			String owner = "";
			String name = "";
			for (int i = 0; i < lista.length; i++) {
				String currentValue = lista[i];
				String[] keyValue = currentValue.split(":");
				if (keyValue[0].trim().equals("name")) {
					name = keyValue[1];
				} else if (keyValue[0].trim().equals("owner")) {
					owner = keyValue[2];
					jsonMap.put(name, owner);
					owner = "";
					name = "";
				}

			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return jsonMap;
	}

	public static Map<String, String> getRepository(String login, String repositoryName) {
		HttpURLConnection httpcon = null;
		try {
			httpcon = (HttpURLConnection) new URL("https://api.github.com/repos/" + login + "/" + repositoryName)
					.openConnection();
		} catch (IOException e) {
			e.printStackTrace();
		}
		httpcon.addRequestProperty("User-Agent", "Mozilla/5.0");
		StringBuilder responseSB = null;
		try (BufferedReader in = new BufferedReader(new InputStreamReader(httpcon.getInputStream()))) {
			responseSB = new StringBuilder();
			String line;
			while ((line = in.readLine()) != null) {
				responseSB.append("\n").append(line);
			}
			httpcon.disconnect();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Map<String, String> listOfInformations = new HashMap<>();
		int downloadsCount = Arrays.stream(responseSB.toString().split("\"download_count\":")).skip(1)
				.mapToInt(l -> Integer.parseInt(l.split(",")[0])).sum();
		listOfInformations.put("Total Downloads", Integer.toString(downloadsCount));
		int watchersCount = Arrays.stream(responseSB.toString().split("\"watchers_count\":")).skip(1)
				.mapToInt(l -> Integer.parseInt(l.split(",")[0])).sum();
		listOfInformations.put("Watchers Count", Integer.toString(watchersCount));

		return listOfInformations;
	}

	public static String getTopics(String repositoryName, String a) {

		Runtime rt = Runtime.getRuntime();
		RuntimeExec rte = new RuntimeExec();
		StreamWrapper error, output = null;
		try {
			String st = "curl -X  GET https://api.github.com/repos/" + a.trim() + "/" + repositoryName.trim()
					+ "/topics -H \"Accept: application/vnd.github.mercy-preview+json\" -H \"Content-Type: application/vnd.github.v3.full+json/?client_id=87bd7263c9178e153521&client_secret=dc1c9bbbf467bf8768687818c1dabbffc684f45c\"";
			System.out.println(st);
			Process proc = rt.exec(st);
			error = rte.getStreamWrapper(proc.getErrorStream(), "ERROR");
			output = rte.getStreamWrapper(proc.getInputStream(), "OUTPUT");
			@SuppressWarnings("unused")
			int exitVal = 0;
			error.start();
			output.start();
			error.join(3000);
			output.join(3000);
			exitVal = proc.waitFor();
			output.message = output.message.trim().replaceAll("[^a-zA-Z0-9\\s]", "");
			output.message = StringUtils.normalizeSpace(output.message);
			output.message.replace(" ", ",");
			output.message = output.message.replace("names", "");
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return output.message;
	}
}
