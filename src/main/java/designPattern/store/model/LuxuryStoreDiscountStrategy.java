package designPattern.store.model;

public class LuxuryStoreDiscountStrategy implements DiscountStrategy {
    @Override
    public double calculateDiscount(double price) {
        // 럭셔리 스토어 할인 계산 로직
        return price;
    }
}
