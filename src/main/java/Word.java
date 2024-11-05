import java.util.Random;
import java.util.List;

public class Word {
    public Word(List<String> dictionary) {
        this.dictionary = dictionary;
        setRandomWord();
        hideWord();
    }

    private List<String> dictionary;
    private String randomWord;
    private String hiddenWord;


    public String getHiddenWord() {
        return hiddenWord;
    }

    public String getRandomWord() {
        return randomWord;
    }

    private void setRandomWord() {
        Random random = new Random();
        int randomNumber = random.nextInt(dictionary.size());
        randomWord = dictionary.get(randomNumber);
    }

    private void hideWord() {
        StringBuilder stringBuilder = new StringBuilder(randomWord);
        for (int i = 0; i < randomWord.length(); i++) {
            stringBuilder.replace(i, i + 1, "*");
        }
        hiddenWord = stringBuilder.toString();
    }

    public void openLetters(String enteredLetter) {
        StringBuilder stringBuilder = new StringBuilder(hiddenWord);
        for (int i = 0; i < randomWord.length(); i++) {
            if (enteredLetter.charAt(0) == randomWord.charAt(i)) {
                stringBuilder.replace(i, i + 1, enteredLetter);
            }
        }
        hiddenWord = stringBuilder.toString();
    }

    public boolean checkContainsLetter(String enteredLetter) {
        return (randomWord.contains(enteredLetter));
    }

    public boolean checkOpening() {
        return (hiddenWord.equals(randomWord));
    }
}
