public enum Picture {
    PIC1 ("\u001b[30;47m\n\n\n\n\n\n\n_____________\n||_________||\n\u001b[0m"),
    PIC2 ("\u001b[30;47m\n||\n||\n||\n||\n||\n||\n||___________\n||_________||\n\u001b[0m"),
    PIC3 ("\u001b[30;47m_________\n||\n||\n||\n||\n||\n||\n||___________\n||_________||\n\u001b[0m"),
    PIC4 ("\u001b[30;47m_________\n||      |\n||      |\n||\n||\n||\n||\n||___________\n||_________||\n\u001b[0m"),
    PIC5 ("\u001b[30;47m_________\n||      |\n||      |\n||      O\n||\n||\n||\n||___________\n||_________||\n\u001b[0m"),
    PIC6 ("\u001b[30;47m_________\n||      |\n||      |\n||      O\n||     /|\\\n||     / \\\n||\n||___________\n||_________||\n\u001b[0m");

    private final String title;

    Picture(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}
