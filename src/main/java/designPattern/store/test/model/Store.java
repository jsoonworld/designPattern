package designPattern.store.test.model;

public class Store {
    private int contractYears;
    private double size;
    private double rent;
    private String location;

    // 생성자는 private으로 설정
    private Store(StoreBuilder builder) {
        this.contractYears = builder.contractYears;
        this.size = builder.size;
        this.rent = builder.rent;
        this.location = builder.location;
    }

    public static class StoreBuilder {
        private int contractYears;
        private double size;
        private double rent;
        private String location;

        public StoreBuilder setContractYears(int contractYears) {
            this.contractYears = contractYears;
            return this;
        }

        public StoreBuilder setSize(double size) {
            this.size = size;
            return this;
        }

        public StoreBuilder setRent(double rent) {
            this.rent = rent;
            return this;
        }

        public StoreBuilder setLocation(String location) {
            this.location = location;
            return this;
        }

        public Store build() {
            return new Store(this);
        }
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

