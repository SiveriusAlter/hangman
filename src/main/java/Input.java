import java.util.Scanner;

public class Input {
    private String InputConsole(){
        Scanner in = new Scanner(System.in);
        return in.nextLine().toLowerCase();
    }

    public MenuOption InputOption() {
        System.out.println("Хочешь сыграть в игру?\nДа или Нет: ");
        while (true) {
            String word = InputConsole();
            if (ValidateLetters(word)) return ValidateTF(word);
            else {
                System.out.println(MenuOption.ERROR.getTitle());
            }
        }
    }


    public String InputWord(int wordLength) {
        System.out.println("Введите букву или слово целиком:\n");
        while (true) {
            String word = InputConsole();
            if (ValidateLetters(word) && ValidLength(word, wordLength)) return word;
            else {
                System.out.println("Введите букву или слово целиком!!");
            }
        }
    }

    public boolean ValidateLetters(String word) {
        return (word.matches("[а-я]+"));
    }

    public MenuOption ValidateTF(String word) {
        if (word.equals(MenuOption.PLAY.getTitle().toLowerCase())) return MenuOption.PLAY;
        else if (word.equals(MenuOption.EXIT.getTitle().toLowerCase())) return MenuOption.EXIT;
        else return MenuOption.ERROR;
    }

    private boolean ValidLength(String word, int wordLength) {
        return (word.length() == 1 || word.length() == wordLength);
    }
}
