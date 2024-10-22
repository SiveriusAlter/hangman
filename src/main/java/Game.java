public class Game {

    public void Play(String randomWord) {
        CheckResult result;
        String inputWord;
        Picture[] pictures = Picture.values();
        String hiddenWord = HidingWord(randomWord);
        for(int i = 0; i < pictures.length;) {
            System.out.println("Введите букву или слово целиком:\n");
            inputWord = Input.InputWord(randomWord.length());
            result = CheckWord(randomWord, inputWord);
            if (result == CheckResult.WIN) Output.ResultOut(result, randomWord);
            else if (result == CheckResult.CONTAIN) {
                hiddenWord = OpeningLetters(hiddenWord,randomWord,inputWord);
                if (hiddenWord.equals(randomWord)) {
                    result = CheckResult.WIN;
                }
                Output.ResultOut(result, hiddenWord);
            }
            else {
                Output.ResultOut(result, hiddenWord, pictures[i]);
                i++;
            }
            if (result == CheckResult.WIN) break;
        }
    }

    private CheckResult CheckWord(String randomWord, String inputWord) {
        if(randomWord.equals(inputWord)) return CheckResult.WIN;
        else if(randomWord.contains(inputWord)) return CheckResult.CONTAIN;
        else return CheckResult.MISTAKE;
    }

    private String HidingWord(String randomWord) {
        StringBuilder hiddenWord = new StringBuilder(randomWord);
        for(int i = 0; i<randomWord.length(); i++) {
            hiddenWord.replace(i,i+1,"*");
        }
        return hiddenWord.toString();
    }

    private String OpeningLetters(String hiddenWord, String randomWord, String inputWord) {
        StringBuilder openWord = new StringBuilder(hiddenWord);
        for (int i = 0; i<randomWord.length(); i++) {
            if(inputWord.charAt(0) == randomWord.charAt(i)) {
                openWord.replace(i,i+1, inputWord);
            }
        }
        return openWord.toString();
    }
}
