import java.util.List;

public class Output {
    private static String RESULTTEXT = "Результат: %s Рандомное слово: %s \n%s\n";
    private static String STARTGAME = "Мы загадали слово, но вы увидите звезды!\nВот они: %s\n Длина слова: %d\n";
    private static String LOSEGAME = "Поздравляю! Вы проиграли!\nСлово было: %s\n\n";


    public static void printResult(Result result, String randomWord, int i) {
        Picture[] pictures = Picture.values();
        if (result != Result.MISTAKE) i--;
        Color color = chooseColor(result);
        String output = String.format(RESULTTEXT,
                result.getTitle(),
                randomWord.toUpperCase(),
                pictures[i].getValue());
        printWithColor(color, output);
    }

    public static void printStartGame(Word word) {
        String text = String.format(STARTGAME,
                word.getHiddenWord(),
                word.getRandomWord().length());
        printWithColor(Color.START, text);
    }

    public static void printLoseGame(Word word) {
        String text = String.format(LOSEGAME,
                word.getRandomWord().toUpperCase());
        printWithColor(Color.LOSE, text);
    }

    public static void printWithColor(Color color, String text) {
        System.out.println(color.getCode() + text + Color.DROP.getCode());
    }

    private static Color chooseColor (Result result) {
        if (result == Result.MISTAKE) return Color.RED;
        return Color.GREEN;
    }
}
