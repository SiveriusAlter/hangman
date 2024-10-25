public class Game {
    public Game(String randomWord, int roundCount) {
        this.randomWord = randomWord;
        this.roundCount = roundCount;
    }

    private String randomWord;
    private int roundCount;


    public void Play() {
        String hiddenWord = HidingWord();
        System.out.printf("Мы загадали слово, но вы увидите звезды!\nВот они: %s\n Длина слова: %d\n",
                hiddenWord,
                randomWord.length());
        for(int i = 0; i < roundCount; i++) {
            Round round = new Round(randomWord, hiddenWord, i);
            if(round.PlayRound() == Result.WIN) break;
            else if (i == roundCount-1) {
                System.out.printf("Поздравляю! Вы лузер! Вы проиграли!\nСлово было: %s",
                        randomWord);
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
}
