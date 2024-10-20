import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Input {
    public static String InputWord() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }
    
    public static String DictPath() {
        return Paths.get("dictionary.txt").toAbsolutePath().toString();
    }
    
    public static ArrayList<String> TakeADictionary() {
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
}
