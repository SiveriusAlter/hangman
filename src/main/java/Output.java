public class Output {
    public static void ResultOut(Result result, String randomWord) {
        System.out.printf("\u001b[32mРезультат: %s Рандомное слово: %s \n\u001b[0m",
                result.getTitle(),
                randomWord.toUpperCase());
    }
    public static void ResultOut(Result result, String randomWord, int i) {
        Picture[] pictures = Picture.values();
        System.out.printf("\u001b[31mРезультат: %s Рандомное слово: %s \n%s\n\u001b[0m",
                result.getTitle(),
                randomWord.toUpperCase(),
                pictures[i].getTitle());
    }
}
