package enclosures;

public enum Fence {
    WOOD (3),
    BRICK(5),
    HEDGE(1),
    GLASS(2),
    WIRE(4),
    DITCH(5),
    AVIARY(6),
    POOL(7),
    VIVARIUM(6);

    private int stability;

    Fence(int stability) {
        this.stability = stability;
    }

    public int getStability() {
        return stability;
    }
}
