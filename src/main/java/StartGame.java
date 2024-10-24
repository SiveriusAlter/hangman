
public class StartGame {
    public static void Start() {
        GameDictionary newDict = new GameDictionary();
        while (true) {
            Input input = new Input();
            MenuOption response = input.InputOption();
            switch (response) {
                case PLAY:
                    Game newGame = new Game();
                    newGame.Play(newDict.getRndWord(), input);
                    break;
                case EXIT:
                    System.exit(0);
            }
        }
    }
}
