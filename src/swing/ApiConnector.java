package swing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ApiConnector {
	public static ArrayList<Repository> searchRepos() {
		ArrayList<ArrayList<String>> results = new ArrayList<ArrayList<String>>();
		HttpURLConnection httpcon = null;
		try {
			httpcon = (HttpURLConnection) new URL(
					"https://api.github.com/search/repositories?q=3d&sort=stars&order=desc").openConnection();
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
		} catch (IOException e) {
			e.printStackTrace();
		}
		ArrayList<String> repositoriesName = new ArrayList<>();

		Arrays.stream(responseSB.toString().split("\"name\":")).skip(1).map(l -> l.split(",")[0])
				.forEach(l -> repositoriesName.add(l.replaceAll("\"", "")));

		ArrayList<String> ownersName = new ArrayList<String>();
		Arrays.stream(responseSB.toString().split("\"login\":")).skip(1).map(l -> l.split(",")[0])
				.forEach(l -> ownersName.add(l.replaceAll("\"", "")));

		ArrayList<Integer> watchersCount = new ArrayList<Integer>();
		Arrays.stream(responseSB.toString().split("\"watchers\":")).skip(1).map(l -> l.split(",")[0])
				.forEach(l -> watchersCount.add(Integer.parseInt(l)));
		
		List<Repository> repos = new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			int watchers = watchersCount.get(i);
			Repository repo = new Repository(repositoriesName.get(i), ownersName.get(i), watchers);
			repos.add(repo);
		}
		
		System.out.println(repos);

		return (ArrayList<Repository>) repos;
	}
}