import java.io.File;

public abstract class FileMedia extends MediaItem{

    protected File file;

    public FileMedia(String title, String description, String file) throws Exception{
        super(title, description );
        this.file = new File(file);
    }

}
