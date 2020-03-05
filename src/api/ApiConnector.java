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
	public static Map<String, String> searchRepos(String[] qToSearch, String language) {
		Runtime rt = Runtime.getRuntime();
		RuntimeExec rte = new RuntimeExec();
		StreamWrapper error, output = null;
		Map<String, String> jsonMap = new HashMap<>();
		String query = getQueryToSearch(language, qToSearch);
		try {
			Process proc = rt.exec(query);
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

	private static String getQueryToSearch(String language, String[] topics) {
		String que = splitString(topics);
		String queryToSearch;
		if (StringUtils.isBlank(language)) {
			queryToSearch = "curl -X GET https://api.github.com/search/repositories?q=" + que.toLowerCase()
					+ "&sort=stars&order=desc";
		} else {
			queryToSearch = "curl -X GET https://api.github.com/search/repositories?q=" + que.toLowerCase()
					+ "language:" + language + "&sort=stars&order=desc";
		}
		return queryToSearch;
	}

	private static String splitString(String[] topics) {
		String finalString = "";
		for (String st : topics) {
			finalString += "topic:" + st + "+";
		}
		return finalString;
	}
	
	
	//TODO
	public static HashMap<String, String> getDetailsOfRepo(String owner, String repositoryName){
		Runtime rt = Runtime.getRuntime();
		RuntimeExec rte = new RuntimeExec();
		StreamWrapper error, output = null;
		try {
			String st = "curl -X GET https://api.github.com/repos/" + owner.trim() + "/" + repositoryName.trim()+"/downloads/";
			Process proc = rt.exec(st);
			error = rte.getStreamWrapper(proc.getErrorStream(), "ERROR");
			output = rte.getStreamWrapper(proc.getInputStream(), "OUTPUT");
			int exitVal = 0;
			error.start();
			output.start();
			error.join(3000);
			output.join(3000);
			exitVal = proc.waitFor();
			System.out.println();
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return new HashMap<String, String>();
	}

	public static String getTopics(String repositoryName, String a) {

		Runtime rt = Runtime.getRuntime();
		RuntimeExec rte = new RuntimeExec();
		StreamWrapper error, output = null;
		try {
			String st = "curl -X  GET https://api.github.com/repos/" + a.trim() + "/" + repositoryName.trim()
					+ "/topics -H \"Accept: application/vnd.github.mercy-preview+json\" -H \"Content-Type: application/vnd.github.v3.full+json/?client_id=87bd7263c9178e153521&client_secret=dc1c9bbbf467bf8768687818c1dabbffc684f45c\"";
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
