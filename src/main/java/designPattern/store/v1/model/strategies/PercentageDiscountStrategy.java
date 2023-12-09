package designPattern.store.v1.model.strategies;

import designPattern.store.v1.model.interfaces.DiscountStrategy;

public class PercentageDiscountStrategy implements DiscountStrategy {
    private double percentage;

    public PercentageDiscountStrategy(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double applyDiscount(double price) {
        return price * (1 - percentage);
    }
}
