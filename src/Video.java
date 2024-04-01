public class Video extends FileMedia implements Playable{

    public Video(String title, String description, String file) throws Exception {
        super(title, description, file);
    }

    public void play() {
        //will be implemented later.
    }

    public String display() {
        return " <h2>" + title+ "</h2><p>" +description+ "</p>\n" + "<video width='300' autoplay> <source src='" + file.toURI() + "' type='video/mp4' />" + "Your browser does not support the video element.</video>";
    }

}