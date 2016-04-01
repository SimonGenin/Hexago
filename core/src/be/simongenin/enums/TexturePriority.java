package be.simongenin.enums;

public enum TexturePriority {

    BACKGROUND(1), BOARD_BACKGROUND(2), BOARD_FOREGROUND(3), BOARD_TOP(4), UI(5);

    public int value;

    private TexturePriority(int value) {
        this.value = value;
    }

}
