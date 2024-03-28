import java.util.HashMap;

public class MediaCollection {
    
    private HashMap<Topic, MediaItem> media = new HashMap<Topic, MediaItem>();

    public MediaCollection() throws Exception
    {
        this.media.put(Topic.Bacon, new Image("Bacon", "a slice!", "bacon.jpg"));
    }

    public HashMap<Topic, MediaItem> getMedia() {
        return media;
    }
}
