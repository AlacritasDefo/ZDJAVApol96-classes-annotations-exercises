package pl.sda;

public enum Color {

    GREEN(true),
    RED(true),
    BLACK(false),
    WHITE(true),
    YELLOW(false);

    private boolean isPretty;

    Color(boolean isPretty) {
        this.isPretty = isPretty;
    }

    public boolean isPretty() {
        return isPretty;
    }
}
