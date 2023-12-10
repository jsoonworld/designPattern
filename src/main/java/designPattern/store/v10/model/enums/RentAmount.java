package designPattern.store.v10.model.enums;

public enum RentAmount {
    LOW(300000.0),
    MEDIUM(500000.0),
    HIGH(700000.0);

    private final double rent;

    RentAmount(double rent) {
        this.rent = rent;
    }

    public double getRent() {
        return this.rent;
    }

    @Override
    public String toString() {
        return this.name() + " (" + this.rent + " per month)";
    }
}
