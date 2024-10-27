public class Game {
    public Game(String randomWord, int roundCount) {
        this.randomWord = randomWord;
        this.roundCount = roundCount;
    }

    private String randomWord;
    private String allInputWord;
    private int roundCount;


    public void Play() {
        String hiddenWord = HidingWord();
        Output.PrintStartGame(hiddenWord, randomWord);
        for(int i = 0; i < roundCount; i++) {
            Round round = new Round(randomWord, hiddenWord, i);
            if(round.PlayRound() == Result.WIN) break;
            else if (i == roundCount-1) {
                Output.PrintLoseGame(randomWord);
            } else {
                hiddenWord = round.getHiddenWord();
            }
        }
    }

    private String HidingWord() {
        StringBuilder hiddenWord = new StringBuilder(randomWord);
        for(int i = 0; i<randomWord.length(); i++) {
            hiddenWord.replace(i,i+1,"*");
        }
        return hiddenWord.toString();
    }

    public class Round {
        public Round(String randomWord, String hiddenWord, int roundNumber){
            this.randomWord = randomWord;
            this.hiddenWord = hiddenWord;
            this.roundNumber = roundNumber;
        }


        public String getHiddenWord () {
            return hiddenWord;
        }

        private String randomWord;
        private String hiddenWord;
        private String inputWord;
        private int roundNumber;

        public Result PlayRound () {
            Result result;
            do {
                inputWord = Input.InputWord();
                result = CheckContainsLetter();
                allInputWord = Input.SavingInput(allInputWord, inputWord);
                if (result == Result.CONTAIN) {
                    hiddenWord = OpeningLetters();
                    if (hiddenWord.equals(randomWord)) result = Result.WIN;
                } else if (result == Result.MISTAKE) {
                    Output.PrintResult(result, hiddenWord, roundNumber);
                    return result;
                }
                Output.PrintResult(result, hiddenWord);
            } while (result == Result.CONTAIN || result == Result.INALLINPUT);
            return result;
        }

        private String OpeningLetters () {
            StringBuilder openWord = new StringBuilder(hiddenWord);
            for (int i = 0; i < randomWord.length(); i++) {
                if (inputWord.charAt(0) == randomWord.charAt(i)) {
                    openWord.replace(i, i + 1, inputWord);
                }
            }
            return openWord.toString();
        }

        private Result CheckContainsLetter() {
            if (randomWord.equals(inputWord)) return Result.WIN;
            else if (allInputWord != null && allInputWord.contains(inputWord)) return Result.INALLINPUT;
            else if (randomWord.contains(inputWord)) return Result.CONTAIN;
            else return Result.MISTAKE;
        }
    }
}
