package Enum;

public enum ExeDoi {
    PIZZA("Pizza cu sos"),
    PASTE("Paste carbonara"),
    CIORBA("Radauteana");
    private final String feldeMancare;

    private ExeDoi( String feldeMancare){
        this.feldeMancare= feldeMancare;
    }

    public String getFeldeMancare() {
        return feldeMancare;
    }
}
