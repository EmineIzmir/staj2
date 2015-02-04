package sikayetVar;

import org.eclipse.jetty.client.HttpClient;
import org.eclipse.jetty.client.api.ContentResponse;

public class Client {
	private String htmlCodeOfPage;
	private String url;

	public String client() throws Exception {
		HttpClient httpClient = new HttpClient();
		httpClient.setFollowRedirects(false);
		httpClient.start();

		ContentResponse response = httpClient.GET(url);
		htmlCodeOfPage = response.getContentAsString();
		httpClient.stop();

		return htmlCodeOfPage;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}