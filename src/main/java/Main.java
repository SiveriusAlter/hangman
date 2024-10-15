import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String result = CheckForAWord(TakeADictionary(),InputWord());
        System.out.printf("Результат: %s", result);
    }

    public static String InputWord() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public static ArrayList<String> TakeADictionary() {
        ArrayList<String> wordsDict = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader("D:\\JavaProjects\\hangman\\dictionary.txt")))
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

    public static String CheckForAWord(ArrayList<String> wordsDict, String word) {
        if(wordsDict.contains(word)) return "Бинго!!!";
        else return "Лузер!!!";
    }

}