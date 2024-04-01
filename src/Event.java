public class Event extends MediaItem{

    public Event(String title, String description) throws Exception{
        super(title, description);
    }

    public String display(){
        return "<h2>"+title+"</h2>\n<p>"+description+"</p>";
    }
}