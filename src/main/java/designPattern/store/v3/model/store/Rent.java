package designPattern.store.v3.model.store;

public enum Rent {
    LOW(5000), MEDIUM(10000), HIGH(50000);

    private final int amount;

    Rent(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
