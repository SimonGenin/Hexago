package be.simongenin.enums;

public enum TexturePriority {

    BACKGROUND(1), FOREGROUND(2), UI(3);

    public int value;

    private TexturePriority(int value) {
        this.value = value;
    }

}
