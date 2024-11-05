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
        System.out.printf(Color.BLU.getCode() + "Хочешь сыграть со мной в игру? :P\nЯ загадываю тебе слово, а ты его не отгадываешь\nи замечательно висиш на этой красивой висилице!!\n%s" + Color.DROP.getCode(), Picture.PIC1.getValue());
        System.out.printf("Сейчас вы\n" + Color.GREEN.getCode() + "спаслись: %d раз\n" + Color.RED.getCode() + "повешаны: %d раз!\n" + Color.DROP.getCode(), countWin, countLose);
        return Input.inputMenuOption();

    }
}
