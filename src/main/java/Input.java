import java.util.Scanner;
import java.util.function.Predicate;

public class Input {

    private static String inputConsole(){
        Scanner in = new Scanner(System.in);
        return in.nextLine().toLowerCase();
    }

    public static MenuOption inputMenuOption() {
        String output = MenuOption.PLAY.getTitle() + " или " + MenuOption.EXIT.getTitle() + ": ";
        String input = inputDialog(output, MenuOption.ERROR.getTitle(),
                s -> validateMenuOption(s));
        return takeMenuOption(input);
    }


    public static String inputRussianLetter() {
        String output = ("Введите букву на русском языке.\n");
        String input = inputDialog(output, "Вы ввели что-то другое! Букву на русском языке!",
                s -> validateLetters(s) && validateLength(s));
        return input;
    }

    private static String inputDialog(String title, String failMessage, Predicate<String> validator) {
        Output.printWithColor(Color.ITALICS, title);
        while (true) {
            String word = inputConsole();
            if (validator.test(word)) {
                return word;
            }
            Output.printWithColor(Color.ITALICS, failMessage);
        }
    }

    private static boolean validateLetters(String word) {
        return (word.matches("[а-яё]+"));
    }

    private static MenuOption takeMenuOption(String word) {
        if (word.equals(MenuOption.PLAY.getTitle().toLowerCase())) return MenuOption.PLAY;
        else if (word.equals(MenuOption.EXIT.getTitle().toLowerCase())) return MenuOption.EXIT;
        return MenuOption.ERROR;
    }

    private static boolean validateMenuOption(String word) {
        return (word.equals(MenuOption.PLAY.getTitle().toLowerCase())
                || word.equals(MenuOption.EXIT.getTitle().toLowerCase()));
    }

    private static boolean validateLength(String word) {
        return (word.length() == 1);
    }

}
