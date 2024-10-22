public class StartGame {
    public static void Start() {
        System.out.println("Хочешь сыграть в игру?\nДа или Нет: ");
        while (true) {
            String response = Input.InputWord();
            if(response.equals("да")) {
                Game newGame = new Game();
                Input newInput = new Input();
                newGame.Play(newInput.RandomWord);
                System.out.println("Конец игры! Хочешь сыграть ещё раз?\nДа или Нет: ");
            }
            else if (response.equals("нет")) System.exit(0);
        else System.out.println("Ты чего такой не понятливый?\nДа или нет!! Пиши сюда: ");
        }
    }
}
