package be.simongenin.enums;

public enum TexturePriority {

    BACKGROUND(1), TILE_BACKGROUND(2), ITEMS(3), TILE_TOP(4), UI(5);

    public int value;

    private TexturePriority(int value) {
        this.value = value;
    }

}
