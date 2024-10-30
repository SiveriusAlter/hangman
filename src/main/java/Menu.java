
public class Menu {
    private int countWin;
    private int countLose;

    public void setCountWin(int countWin) {
        this.countWin = countWin;
    }

    public void setCountLose(int countLose) {
        this.countLose = countLose;
    }

    public int getCountWin() {
        return countWin;
    }

    public int getCountLose() {
        return countLose;
    }

    public MenuOption startMenu() {
        System.out.println("\u001b[36;1mХочешь сыграть со мной в игру? :P\nЯ загадываю тебе слово, а ты его не отгадываешь!\n\u001b[0m");
        System.out.printf("Сейчас у вас \u001b[32m %d побед\u001b[0m и \u001b[31m %d  поражений!\u001b[0m\n",
                countWin, countLose);
        return Input.inputMenuOption();

    }
}
