import java.io.File;

public abstract class FileMedia extends Media{

    protected File file;

    public FileMedia(String title, String description, String url, String file) throws Exception{
        super(title, description, url);
        this.file = new File(file);
    }

}
