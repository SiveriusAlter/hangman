public enum Color {
    BLU ("\u001b[36;1m"),
    RED ("\u001b[31m"),
    GREEN ("\u001b[32m"),
    DROP ("\u001b[0m"),
    START ("\u001b[35m"),
    LOSE ("\u001b[01;31m"),
    ITALICS ("\u001b[3;5m");

    private final String code;

    Color(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
