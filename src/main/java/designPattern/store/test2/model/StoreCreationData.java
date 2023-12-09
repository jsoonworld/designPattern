package designPattern.store.test2.model;

public class StoreCreationData {
    private final StoreType storeType;
    private final int contractYears;
    private final double size;
    private final double rent;
    private final String location;

    public StoreCreationData(StoreType storeType, int contractYears, double size, double rent, String location) {
        this.storeType = storeType;
        this.contractYears = contractYears;
        this.size = size;
        this.rent = rent;
        this.location = location;
    }

    public StoreType getStoreType() {
        return storeType;
    }

    public int getContractYears() {
        return contractYears;
    }

    public double getSize() {
        return size;
    }

    public double getRent() {
        return rent;
    }

    public String getLocation() {
        return location;
    }
}
