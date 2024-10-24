public enum Picture {
    PIC1 ("_______\n" +
            "|     |\n" +
            "|     O\n" +
            "|\n" +
            "|\n" +
            "|\n" +
            "|________\n"),
    PIC2 ("_______\n" +
            "|     |\n" +
            "|     O\n" +
            "|     |\n" +
            "|\n" +
            "|\n" +
            "|________\n"),
    PIC3 ("_______\n" +
            "|     |\n" +
            "|     O\n" +
            "|     |\\\n" +
            "|\n" +
            "|\n" +
            "|________\n"),
    PIC4 ("_______\n" +
            "|     |\n" +
            "|     O\n" +
            "|    /|\\\n" +
            "|\n" +
            "|\n" +
            "|________\n"),
    PIC5 ("_______\n" +
            "|     |\n" +
            "|     O\n" +
            "|    /|\\\n" +
            "|      \\\n" +
            "|\n" +
            "|________\n"),
    PIC6 ("_______\n" +
            "|     |\n" +
            "|     O\n" +
            "|    /|\\\n" +
            "|    / \\\n" +
            "|\n" +
            "|________\n" +
            "Ты проиграл!!\n");

    private final String title;

    Picture(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}
