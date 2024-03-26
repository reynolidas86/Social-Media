public class Song extends FileMedia implements Playable{

    public Song(String title, String description, String url, String file) throws Exception{
        super(title, description, url, file);
    }

    public void play() {
        //will be implemented later.
    }

    public String display() {
        return "<h2>title</h2><p>description</p>\n<audio controls autoplay><source src='" + file.toURI() +"' type='audio/mp3' />" +"Your browser does not support the audioelement.</audio>" + "by " + artist;
    }

}