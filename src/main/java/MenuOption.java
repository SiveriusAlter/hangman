public enum MenuOption {
    PLAY("Да"),
    EXIT("Нет"),
    ERROR("Введи да или нет!");

    private final String title;

    MenuOption(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
