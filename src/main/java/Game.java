import java.util.ArrayList;

public class Game {
    public static String CheckForAWord(ArrayList<String> wordsDict, String word) {
        if(wordsDict.contains(word)) return "Бинго!!!";
        else return "Лузер!!!";
    }
}
