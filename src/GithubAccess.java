import org.eclipse.egit.github.core.Repository;
import org.eclipse.egit.github.core.client.GitHubClient;
import org.eclipse.egit.github.core.service.RepositoryService;


public class GithubAccess{
	public static void main (String [] args) {
	GitHubClient client = new GitHubClient();
    client.setOAuth2Token("393a0233fd47f46e8873d7b87f9f9a3de6c15020");
	getRepos();
	}
	
public static void getRepos() {
RepositoryService service = new RepositoryService();
for (Repository repo : service.getRepositories("fabpot"))
  System.out.println(repo.getName() + " Watchers: " + repo.getWatchers());
}
}