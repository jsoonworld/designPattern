package designPattern.store.v3.model.store;

public enum Size {
    SMALL(50), MEDIUM(200), LARGE(400);

    private final int squareFeet;

    Size(int squareFeet) {
        this.squareFeet = squareFeet;
    }

    public int getSquareFeet() {
        return squareFeet;
    }
}
