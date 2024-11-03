public class Main {
    public static void main(String[] args) {
        GameResources resources = new GameResources();
        GameDictionary dictionary = new GameDictionary(resources.getPath());
        Menu menu = new Menu();
        int roundCount = Picture.values().length;
        while (menu.startMenu() != MenuOption.EXIT) {
            Word word = new Word(dictionary.getDictionary());
            Game newGame = new Game(word, roundCount);
            newGame.playGame();
            if (newGame.getResult() == Result.WIN) menu.setCountWin(menu.getCountWin()+1);
            else menu.setCountLose(menu.getCountLose()+1);
        }
    }
}