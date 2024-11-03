public class Game {
    public Game(Word word, int roundCount) {
        this.word = word;
        this.roundCount = roundCount;
    }

    private final Word word;
    private final int roundCount;
    private LettersStorage letters = new LettersStorage();
    private Result gameResult;

    public Result getGameResult() {
        return gameResult;
    }

    public void playGame() {
        Output.printStartGame(word);
        for(int i = 0; i < roundCount; i++) {
            Result result = playRound(i);
            if(result == Result.WIN) {
                gameResult = Result.WIN;
                break;
            }
            else if(i == roundCount-1) {
                Output.printLoseGame(word);
            }
        }
    }


    private Result playRound(int roundNumber) {
        Result result;
        do {
            String enteredLetter = Input.inputWord();
            word.openLetters(enteredLetter);
            result = checkRoundResult(enteredLetter);
            if (result == Result.MISTAKE) {
                Output.printResult(result, word.getHiddenWord(), roundNumber);
                return result;
            }
            Output.printResult(result, word.getHiddenWord());
        } while (checkRepeatRound(result));
        return result;
    }

    private Result checkRoundResult (String enteredLetter) {
        if (word.checkOpening()) return Result.WIN;
        else if(letters.checkContainAndSaveLetters(enteredLetter)) {
            return Result.INSTORAGE;
        }
        else if (word.checkContainsLetter(enteredLetter)) {
            return Result.CONTAIN;
        }
        else return Result.MISTAKE;
    }

    private boolean checkRepeatRound(Result result) {
        if (result == Result.CONTAIN || result == Result.INSTORAGE) {
            return true;
        } else {
            return false;
        }
    }
}
