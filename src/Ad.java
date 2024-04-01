import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

public class Ad extends MediaItem implements Sponsorable{
    private URL url;

    public Ad(String title, String description, String uri) throws MalformedURLException, URISyntaxException{
        super(title, description);
       URI u = new URI(uri);
       url = u.toURL();
       
    }

    public URL url(){
        return url;
    }

    public String display() throws URISyntaxException{
        return "<h2>" +title+ "</h2>\n<p>" +description+ "</p>\n<a href='" + url.toURI() + "'>" + url + "</a>";
    }
}