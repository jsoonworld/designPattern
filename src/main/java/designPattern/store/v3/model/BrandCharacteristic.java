package designPattern.store.v3.model;

public class BrandCharacteristic {

    private int capacity;      // 수용 인원
    private double avgPrice;   // 평균 가격

    public BrandCharacteristic(int capacity, double avgPrice) {
        this.capacity = capacity;
        this.avgPrice = avgPrice;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getAvgPrice() {
        return avgPrice;
    }

    public void setAvgPrice(double avgPrice) {
        this.avgPrice = avgPrice;
    }
}
