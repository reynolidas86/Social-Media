import java.net.URL;

public class Ad extends Media implements Sponsorable{

    public Ad(String title, String description, String url) throws Exception{
        super(title, description, url);
    }

    public URL url(){
        return url;
    }

    public String display() throws Exception{
        return "<h2>title</h2>\n<p>description</p>\n<a href='" + url.toURI() + "'>" + url + "</a>";
    }
}