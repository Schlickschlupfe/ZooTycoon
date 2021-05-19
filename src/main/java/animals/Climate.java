package animals;

public enum Climate {
    POLAR(1),
    SUB_POLAR(2),
    MODERATE(3),
    SUB_TROPIC(4),
    TROPICAL(5);

    private int heat;

    Climate(int heat) {
        this.heat = heat;
    }

    public int getHeat() {
        return heat;
    }
}
