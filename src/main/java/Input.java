import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Input {
    ArrayList<String> Dictionary = TakeADictionary();
    String RandomWord = TakeRndWord(Dictionary);

    public static String InputWord() {
        Scanner in = new Scanner(System.in);
        return in.nextLine().toLowerCase();
    }
    
    private static String DictPath() {
        return Paths.get("dictionary.txt").toAbsolutePath().toString();
    }
    
    private static ArrayList<String> TakeADictionary() {
        ArrayList<String> wordsDict = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(DictPath())))
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

    private String TakeRndWord(ArrayList<String> Dictionary) {
        Random random = new Random();
        int randomNumber = random.nextInt(Dictionary.size());
        return Dictionary.get(randomNumber);
    }
}
