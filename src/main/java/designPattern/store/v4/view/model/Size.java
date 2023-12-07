package designPattern.store.v4.view.model;

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
