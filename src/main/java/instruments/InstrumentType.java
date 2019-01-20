package instruments;

public enum InstrumentType {

    BRASS("Brass"),
    STRING("String"),
    WIND("Wind"),
    KEYBOARD("Keyboard");



    InstrumentType(String name) {
        this.name = name;
    }

    private final String name;

}



