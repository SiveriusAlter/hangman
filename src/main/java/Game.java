public class Game {
    public Game(Word word, int roundCount) {
        this.word = word;
        this.roundCount = roundCount;
    }

    private final Word word;
    private final int roundCount;
    private LettersStorage letters = new LettersStorage();
    private Result result;

    public Result getResult() {
        return result;
    }

    public void playGame() {
        Output.printStartGame(word);
        for (int i = 0; i < roundCount; i++) {
            playRound(i);
            if (result == Result.WIN) {
                break;
            }
        }
        Output.printLoseGame(word);
    }


    private void playRound(int roundNumber) {
        do {
            String enteredLetter = Input.inputRussianLetter();
            word.openLetters(enteredLetter);
            result = checkRoundResult(enteredLetter);
            Output.printResult(result, word.getHiddenWord(), roundNumber);
        } while (checkRepeatRound(result));
    }

    private Result checkRoundResult(String enteredLetter) {
        if (word.checkOpening()) return Result.WIN;
        else if (letters.checkContainAndSaveLetters(enteredLetter)) {
            return Result.INSTORAGE;
        } else if (word.checkContainsLetter(enteredLetter)) {
            return Result.CONTAIN;
        } else return Result.MISTAKE;
    }

    private boolean checkRepeatRound(Result result) {
        return (result == Result.CONTAIN || result == Result.INSTORAGE);
    }
}
