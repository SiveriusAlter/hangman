
public class Menu {
    public MenuOption StartMenu() {
        System.out.println("\u001b[36;1mХочешь сыграть со мной в игру? :P\nЯ загадываю тебе слово, а ты его не отгадываешь!\n\u001b[0m");
        return Input.InputMenuOption();
    }
}
