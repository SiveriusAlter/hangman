public class StartGame {
    public static void Start() {
        System.out.println("Хочешь сыграть в игру? Да/Нет\n");
        while (true) {
            String response = Input.InputWord();
            if(response.equals("да")) {
                Game newGame = new Game();
                Input newInput = new Input();
                newGame.Play(newInput.RandomWord);
                System.out.println("Конец игры! Хочешь сыграть ещё раз?\n");
            }
            else if (response.equals("нет")) System.exit(0);
        else System.out.println("Да или нет!! Ты чего такой не понятливый?\n");
        }
    }
}
