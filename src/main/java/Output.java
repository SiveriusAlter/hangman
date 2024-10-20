public class Output {
    public static void ResultOut(CheckResult result, String randomWord) {
        System.out.printf("Результат: %s Рандомное слово: %s \n",
                result.getTitle(),
                randomWord);
    }
    public static void ResultOut(CheckResult result, String randomWord, Picture pictures) {
        System.out.printf("Результат: %s Рандомное слово: %s \n%s\n",
                result.getTitle(),
                randomWord,
                pictures.getTitle());
    }
}
