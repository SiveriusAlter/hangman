public class Round {
    public Round(String randomWord, String hiddenWord, int roundNumber) {
        this.randomWord = randomWord;
        this.hiddenWord = hiddenWord;
        this.roundNumber = roundNumber;
    }

    public String getRandomWord() {
        return randomWord;
    }

    public void setRandomWord(String randomWord) {
        this.randomWord = randomWord;
    }

    public String getHiddenWord() {
        return hiddenWord;
    }

    public void setHiddenWord(String hiddenWord) {
        this.hiddenWord = hiddenWord;
    }

    public int getRoundNumber() {
        return roundNumber;
    }

    public void setRoundNumber(int roundNumber) {
        this.roundNumber = roundNumber;
    }

    private String randomWord;
    private String hiddenWord;
    private String inputWord;
    private int roundNumber;

    public Result PlayRound() {
        Result result;
        do {
            inputWord = Input.InputWord(randomWord);
            result = CheckWord();
            if (result == Result.WIN) {
                Output.ResultOut(result, randomWord);
                return result;
            }
            else if (result == Result.CONTAIN) {
                hiddenWord = OpeningLetters();
                if (hiddenWord.equals(randomWord)) result = Result.WIN;
                Output.ResultOut(result, hiddenWord);
            }
            else {
                Output.ResultOut(result, hiddenWord, roundNumber);
                return result;
            }
        } while(result == Result.CONTAIN);
        return result;
    }

    private String OpeningLetters() {
        StringBuilder openWord = new StringBuilder(hiddenWord);
        for (int i = 0; i<randomWord.length(); i++) {
            if(inputWord.charAt(0) == randomWord.charAt(i)) {
                openWord.replace(i,i+1, inputWord);
            }
        }
        return openWord.toString();
    }

    private Result CheckWord() {
        if(randomWord.equals(inputWord)) return Result.WIN;
        else if(randomWord.contains(inputWord)) return Result.CONTAIN;
        else return Result.MISTAKE;
    }
}
