public class Game {

    public void Play(String randomWord) {
        CheckResult result;
        String inputWord;
        do {
            System.out.println("Введите слово или букву:\n");
            inputWord = Input.InputWord();
            result = CheckWord(randomWord, inputWord);
            System.out.printf("Результат: %s Рандомное слово: %s \n", result.getTitle(), randomWord);
        }
        while (result != CheckResult.WIN);
    }

    public CheckResult CheckWord(String randomWord, String inputWord) {
        if(randomWord.equals(inputWord)) return CheckResult.WIN;
        else if(randomWord.contains(inputWord)) return CheckResult.CONTAIN;
        else return CheckResult.MISTAKE;
    }
}
