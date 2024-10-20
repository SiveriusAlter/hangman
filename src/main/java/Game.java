public class Game {

    public void Play(String randomWord) {
        CheckResult result;
        String inputWord;
        Picture[] pictures = Picture.values();
        for(int i = 0; i < pictures.length;) {
            System.out.println("Введите букву или слово целиком:\n");
            inputWord = Input.InputWord(randomWord.length());
            result = CheckWord(randomWord, inputWord);
            if (result == CheckResult.WIN) {
                Output.ResultOut(result, randomWord);
                break;
            }
            else if (result == CheckResult.CONTAIN) Output.ResultOut(result, randomWord);
            else {
                Output.ResultOut(result, randomWord, pictures[i]);
                i++;
            }
        }
    }

    private CheckResult CheckWord(String randomWord, String inputWord) {
        if(randomWord.equals(inputWord)) return CheckResult.WIN;
        else if(randomWord.contains(inputWord)) return CheckResult.CONTAIN;
        else return CheckResult.MISTAKE;
    }
}
