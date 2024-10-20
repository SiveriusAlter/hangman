public enum CheckResult {
    WIN ("Ты победил!"),
    MISTAKE("Не угадал!"),
    CONTAIN ("Есть такая буква!");

    private final String title;

    CheckResult(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
