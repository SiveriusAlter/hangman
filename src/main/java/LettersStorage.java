public class LettersStorage {
    private String letters;

    public String getLetters() {
        return letters;
    }

    public void saveLetters(String inputLetter) {
        if (letters == null) {
            letters = inputLetter;
        } else {

            StringBuilder stringBuilder = new StringBuilder(letters);
            if (!letters.contains(inputLetter)) stringBuilder.append(inputLetter);
            letters = stringBuilder.toString();
        }
    }

    public boolean checkContainAndSaveLetters(String inputLetter) {
        if (letters != null && letters.contains(inputLetter)) {
            return true;
        }
        else {
            saveLetters(inputLetter);
            return false;
        }
    }

}
