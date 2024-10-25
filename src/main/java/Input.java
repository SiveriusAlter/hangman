import java.util.Scanner;

public class Input {
    private static String InputConsole(){
        Scanner in = new Scanner(System.in);
        return in.nextLine().toLowerCase();
    }

    public static MenuOption InputOption() {
        System.out.println("Хочешь сыграть в игру?\nДа или Нет: ");
        while (true) {
            String word = InputConsole();
            if (ValidateLetters(word)) return ValidateTF(word);
            else {
                System.out.println(MenuOption.ERROR.getTitle());
            }
        }
    }


    public static String InputWord(String randomWord) {
        System.out.println("Введите букву или слово целиком.\n");
        while (true) {
            String word = InputConsole();
            if (ValidateLetters(word) && ValidLength(word, randomWord.length())) return word;
            else {
                System.out.println("Введите букву или слово целиком!!");
            }
        }
    }

    private static boolean ValidateLetters(String word) {
        return (word.matches("[а-я]+"));
    }

    private static MenuOption ValidateTF(String word) {
        if (word.equals(MenuOption.PLAY.getTitle().toLowerCase())) return MenuOption.PLAY;
        else if (word.equals(MenuOption.EXIT.getTitle().toLowerCase())) return MenuOption.EXIT;
        else return MenuOption.ERROR;
    }

    private static boolean ValidLength(String word, int wordLength) {
        return (word.length() == 1 || word.length() == wordLength);
    }

    public static String ConcatInput(String allInput, String inputWord) {
        StringBuilder allInputWords = new StringBuilder(allInput);
        allInputWords.append(" " + inputWord);
        return allInputWords.toString();
    }
}
