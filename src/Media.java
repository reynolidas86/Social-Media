import java.net.URL;
import java.net.URI;

public abstract class Media{

    protected String title;
    protected String description;
    protected URL url;

    public Media(String title, String description, String url) throws Exception{
        this.title = title;
        this.description = description;
        this.url = (new URI(url)).toURL();
    }

    public abstract String display() throws Exception;

}
