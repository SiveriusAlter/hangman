import java.util.Scanner;

public class Input {

    private static String inputConsole(){
        Scanner in = new Scanner(System.in);
        return in.nextLine().toLowerCase();
    }

    public static MenuOption inputMenuOption() {
        System.out.println("\u001b[3;5mДа или Нет: \u001b[0m");
        while (true) {
            String word = inputConsole();
            if (validateMenuOption(word)) return takeMenuOption(word);
            else {
                System.out.println(MenuOption.ERROR.getTitle());
            }
        }
    }


    public static String inputWord() {
        System.out.println("\u001b[3;5mВведите букву на русском языке.\n\u001b[0m");
        while (true) {
            String word = inputConsole();
            if (validateLetters(word) && validateLength(word)) return word;
            else {
                System.out.println("\u001b[1;3;5mВведите букву на русском языке!!\u001b[0m");
            }
        }
    }

    private static boolean validateLetters(String word) {
        return (word.matches("[а-яё]+"));
    }

    private static MenuOption takeMenuOption(String word) {
        if (word.equals(MenuOption.PLAY.getTitle().toLowerCase())) return MenuOption.PLAY;
        else if (word.equals(MenuOption.EXIT.getTitle().toLowerCase())) return MenuOption.EXIT;
        else return MenuOption.ERROR;
    }

    private static boolean validateMenuOption(String word) {
        return (word.equals(MenuOption.PLAY.getTitle().toLowerCase())
                || word.equals(MenuOption.EXIT.getTitle().toLowerCase()));
    }

    private static boolean validateLength(String word) {
        return (word.length() == 1);
    }

}
