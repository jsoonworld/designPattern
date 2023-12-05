package designPattern.store.model;

public class NoDiscountStrategy implements DiscountStrategy{

    @Override
    public double applyDiscount(double price) {
        return price; // 할인 없음
    }
}
