import java.io.File;

public class Image extends FileMedia{

    File file;
    public Image(String title, String description, String file) throws Exception{
        super(title, description,file);
        this.file = new File(file);
    }

    public String display() {
        return "<h2>" +title+ "</h2>\n<figure><img src='" + file.toURI() + "' /><figcaption>" + description + "</figcaption></figure>";
    }

}
