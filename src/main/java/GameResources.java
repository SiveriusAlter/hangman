import java.io.File;

public class GameResources {

    private final String PATHTODICTIONARY = "gameresources/dictionary.txt";

    private File file = new File(PATHTODICTIONARY);

    public String getPath() {
        return file.getPath();
    }
}
