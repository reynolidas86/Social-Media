public class Event extends MediaItem{

    public Event(String title, String description, String url) throws Exception{
        super(title, description, url);
    }

    public String display(){
        return "<h2>"+title+"</h2>\n<p>"+description+"</p>";
    }
}