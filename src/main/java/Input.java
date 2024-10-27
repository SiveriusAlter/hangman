import java.util.Scanner;

public class Input {
    private static String InputConsole(){
        Scanner in = new Scanner(System.in);
        return in.nextLine().toLowerCase();
    }

    public static MenuOption InputMenuOption() {
        System.out.println("\u001b[3;5mДа или Нет: \u001b[0m");
        while (true) {
            String word = InputConsole();
            if (ValidateLetters(word)) return ValidateMenuOption(word);
            else {
                System.out.println(MenuOption.ERROR.getTitle());
            }
        }
    }


    public static String InputWord() {
        System.out.println("\u001b[3;5mВведите букву на русском языке.\n\u001b[0m");
        while (true) {
            String word = InputConsole();
            if (ValidateLetters(word) && ValidateLength(word)) return word;
            else {
                System.out.println("\u001b[1;3;5mВведите букву на русском языке!!\u001b[0m");
            }
        }
    }

    private static boolean ValidateLetters(String word) {
        return (word.matches("[а-я]+"));
    }

    private static MenuOption ValidateMenuOption(String word) {
        if (word.equals(MenuOption.PLAY.getTitle().toLowerCase())) return MenuOption.PLAY;
        else if (word.equals(MenuOption.EXIT.getTitle().toLowerCase())) return MenuOption.EXIT;
        else return MenuOption.ERROR;
    }

    private static boolean ValidateLength(String word) {
        return (word.length() == 1);
    }

    public static String SavingInput(String allInput, String inputWord) {
        if (allInput != null) {
            StringBuilder allInputWords = new StringBuilder(allInput);
            if (!allInput.contains(inputWord)) allInputWords.append(inputWord);
            return allInputWords.toString();
        } else return inputWord;
    }
}
