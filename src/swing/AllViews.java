package swing;

public class AllViews {
	public static AllViews view = null;
	private HomeView homeView;
	private RepositoriesView repositoryView;
	private RepositoryDetailed detailedRepository;
	private SearchView serachView;

	public static AllViews getInstances() {
		if (view == null) {
			view = new AllViews();
		}
		return view;
	}

	public HomeView getHomeView() {
		return homeView;
	}

	public void setHomeView(HomeView homeView) {
		this.homeView = homeView;
	}

	public RepositoriesView getRepositoryView() {
		return repositoryView;
	}

	public void setRepositoryView(RepositoriesView repositoryView) {
		this.repositoryView = repositoryView;
	}

	public RepositoryDetailed getDetailedRepository() {
		return detailedRepository;
	}

	public void setDetailedRepository(RepositoryDetailed detailedRepository) {
		this.detailedRepository = detailedRepository;
	}

	public SearchView getSerachView() {
		return serachView;
	}

	public void setSerachView(SearchView serachView) {
		this.serachView = serachView;
	}

}
