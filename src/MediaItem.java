import java.net.URL;
import java.net.URI;

public abstract class MediaItem{

    protected String title;
    protected String description;
    

    public MediaItem(String title, String description) throws Exception{
        this.title = title;
        this.description = description;
        
    }

    public abstract String display() throws Exception;

}
