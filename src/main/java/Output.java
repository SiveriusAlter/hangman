public class Output {
    public static void ResultOut(CheckResult result, String randomWord) {
        System.out.printf("\u001B[31m" + "Результат: %s Рандомное слово: %s \n",
                result.getTitle(),
                randomWord.toUpperCase());
    }
    public static void ResultOut(CheckResult result, String randomWord, int i) {
        Picture[] pictures = Picture.values();
        System.out.printf("\u001B[31m" + "Результат: %s Рандомное слово: %s \n%s\n",
                result.getTitle(),
                randomWord.toUpperCase(),
                pictures[i].getTitle());
    }
}
