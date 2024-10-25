
public class Menu {
    public static void StartMenu() {
        GameDictionary newDict = new GameDictionary();
        while (true) {
            MenuOption response = Input.InputOption();
            switch (response) {
                case PLAY:
                    Game newGame = new Game(newDict.getRndWord(), Picture.values().length);
                    newGame.Play();
                    break;
                case EXIT:
                    System.exit(0);
            }
        }
    }
}
