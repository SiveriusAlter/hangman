public class Output {
    public static void ResultOut() {
        String result = Game.CheckForAWord(Input.TakeADictionary(),Input.InputWord());
        System.out.printf("Результат: %s", result);
    }
}
