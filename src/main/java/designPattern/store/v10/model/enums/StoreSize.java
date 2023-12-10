package designPattern.store.v10.model.enums;

public enum StoreSize {
    SMALL(50.0),
    MEDIUM(100.0),
    LARGE(150.0);

    private final double size;

    StoreSize(double size) {
        this.size = size;
    }

    public double getSize() {
        return this.size;
    }
}
