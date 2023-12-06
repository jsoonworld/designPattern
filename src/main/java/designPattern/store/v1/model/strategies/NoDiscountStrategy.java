package designPattern.store.v1.model.strategies;

import designPattern.store.v1.model.interfaces.DiscountStrategy;

public class NoDiscountStrategy implements DiscountStrategy {

    @Override
    public double applyDiscount(double price) {
        return price; // 할인 없음
    }
}
