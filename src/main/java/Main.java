public class Main {
    public static void main(String[] args) {
        GameDictionary dictionary = new GameDictionary();
        Menu menu = new Menu();
        int roundCount = Picture.values().length;
        while (menu.startMenu() != MenuOption.EXIT) {
            Game newGame = new Game(dictionary.getRndWord(), roundCount);
            newGame.playGame();
            if (newGame.getGameResult() == Result.WIN) menu.setCountWin(menu.getCountWin()+1);
            else menu.setCountLose(menu.getCountLose()+1);
        }
    }
}