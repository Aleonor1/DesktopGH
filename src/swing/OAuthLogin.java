package swing;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class OAuthLogin {

	public static void main(String[] args) {
		String clientSecret = "dc1c9bbbf467bf8768687818c1dabbffc684f45c";
		String redirectURI = "https://github.com/Aleonor1/DesktopGH";
		String clientID = "87bd7263c9178e153521";
		Desktop desk = Desktop.getDesktop();
		try {
			desk.browse(new URI("https://github.com/login/oauth/authorize" + "?client_id=" + clientID + "&scope=repo&redirect_uri="+redirectURI));
		} catch (IOException | URISyntaxException e) {
			e.printStackTrace();
		}
	}
}
