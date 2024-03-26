public class Image extends FileMedia{

    public Image(String title, String description, String url, String file) throws Exception{
        super(title, description, url, file);
    }

    public String display() {
        return "<h2>title</h2>\n<figure><img src='" + file.toURI() + "' /><figcaption>" + description + "</figcaption></figure>";
    }

}
