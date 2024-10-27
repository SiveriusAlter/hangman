public enum Result {
    WIN ("Ты победил!"),
    MISTAKE("Не угадал!"),
    CONTAIN ("Есть такая буква!"),
    INALLINPUT ("Вы вводили такую букву раньше!");

    private final String title;

    Result(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
