import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;

public class GameDictionary {
    public String getRndWord() {
        return takeRndWord(takeADictionary());
    }

    private String getDictPath() {
        return Paths.get("dictionary.txt").toAbsolutePath().toString();
    }

    private ArrayList<String> takeADictionary() {
        ArrayList<String> wordsDict = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(getDictPath())))
        {
            String word;
            while ((word = br.readLine())!=null){
                wordsDict.add(word);
            }
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return wordsDict;
    }

    private String takeRndWord(ArrayList<String> Dictionary) {
        Random random = new Random();
        int randomNumber = random.nextInt(Dictionary.size());
        return Dictionary.get(randomNumber);
    }
}
