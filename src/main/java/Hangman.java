public class Hangman {
    public static void main(String[] args) {
        GameDictionary dictionary = new GameDictionary();
        Menu menu = new Menu();
        while (menu.StartMenu() != MenuOption.EXIT) {
            Game newGame = new Game(dictionary.getRndWord(), Picture.values().length);
            newGame.Play();
        }
    }
}