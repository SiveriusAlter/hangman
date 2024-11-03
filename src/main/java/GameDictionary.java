import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GameDictionary {
    public GameDictionary(String path) {
        this.path = path;
        setDictionary();
    }

    private String path;
    private List<String> dictionary = new ArrayList<>();

    public List<String> getDictionary() {
        return dictionary;
    }

    private void setDictionary() {
        try(BufferedReader br = new BufferedReader(new FileReader(path)))
        {
            String word;
            while ((word = br.readLine())!=null){
                dictionary.add(word);
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
