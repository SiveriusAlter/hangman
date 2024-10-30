public class Output {
    public static void printResult(Result result, String randomWord) {
        System.out.printf("\u001b[32mРезультат: %s Рандомное слово: %s \n\u001b[0m",
                result.getTitle(),
                randomWord.toUpperCase());
    }

    public static void printResult(Result result, String randomWord, int i) {
        Picture[] pictures = Picture.values();
        System.out.printf("\u001b[31mРезультат: %s Рандомное слово: %s \n%s\n\u001b[0m",
                result.getTitle(),
                randomWord.toUpperCase(),
                pictures[i].getTitle());
    }

    public static void printStartGame(String hiddenWord, String randomWord) {
        System.out.printf("\u001b[35mМы загадали слово, но вы увидите звезды!\nВот они: %s\n Длина слова: %d\n\u001b[0m",
                hiddenWord,
                randomWord.length());
    }

    public static void printLoseGame(String randomWord) {
        System.out.printf("\u001b[01;31mПоздравляю! Вы проиграли!\nСлово было: %s\n\n\u001b[0m",
                randomWord.toUpperCase());
    }
}
