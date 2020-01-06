package swing;

public class Repository {
	private String name;
	private String watchers;
	private String login;

	public Repository(String name, String login, int watchers) {
		super();
		this.name = name;
		this.watchers = Integer.toString(watchers);
		this.login = login;
	}

	public String getName() {
		return name;
	}

	public String getWatchers() {
		return watchers;
	}

	public String getLogin() {
		return login;
	}

	@Override
	public String toString() {
		return "Repository [name=" + name + ", watchers=" + watchers + ", login=" + login + "]";
	}

}
