public class Game {
    public Game(String randomWord, int roundCount) {
        this.randomWord = randomWord;
        this.roundCount = roundCount;
    }

    private final String randomWord;
    private final int roundCount;
    private String allInputWord;
    private Result gameResult;

    public Result getGameResult() {
        return gameResult;
    }

    public void playGame() {
        String hiddenWord = hidingWord();
        Output.printStartGame(hiddenWord, randomWord);
        for(int i = 0; i < roundCount; i++) {
            Round round = new Round(randomWord, hiddenWord, i);
            if(round.playRound() == Result.WIN) {
                gameResult = Result.WIN;
                break;
            }
            else if (i == roundCount-1) {
                Output.printLoseGame(randomWord);
            } else {
                hiddenWord = round.getHiddenWord();
            }
        }
    }

    private String hidingWord() {
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

        private final String randomWord;
        private final int roundNumber;
        private String hiddenWord;
        private String inputWord;


        public Result playRound() {
            Result result;
            do {
                inputWord = Input.inputWord();
                result = checkContainsLetter();
                allInputWord = Input.savingInput(allInputWord, inputWord);
                if (result == Result.CONTAIN) {
                    hiddenWord = openingLetters();
                    if (hiddenWord.equals(randomWord)) result = Result.WIN;
                } else if (result == Result.MISTAKE) {
                    Output.printResult(result, hiddenWord, roundNumber);
                    return result;
                }
                Output.printResult(result, hiddenWord);
            } while (result == Result.CONTAIN || result == Result.INALLINPUT);
            return result;
        }

        private String openingLetters() {
            StringBuilder openWord = new StringBuilder(hiddenWord);
            for (int i = 0; i < randomWord.length(); i++) {
                if (inputWord.charAt(0) == randomWord.charAt(i)) {
                    openWord.replace(i, i + 1, inputWord);
                }
            }
            return openWord.toString();
        }

        private Result checkContainsLetter() {
            if (randomWord.equals(inputWord)) return Result.WIN;
            else if (allInputWord != null && allInputWord.contains(inputWord)) return Result.INALLINPUT;
            else if (randomWord.contains(inputWord)) return Result.CONTAIN;
            else return Result.MISTAKE;
        }
    }
}
