package designPattern.store.model.factories;

import designPattern.store.model.interfaces.Store;
import designPattern.store.model.interfaces.DiscountStrategy;
import designPattern.store.model.strategies.PercentageDiscountStrategy;
import designPattern.store.model.stores.SportsStore;

public class SportsStoreFactory extends StoreFactory {
    @Override
    public Store createStore() {
        // 할인 전략 인스턴스 생성, 예를 들어 모든 상품에 대해 10% 할인을 적용한다고 가정
        DiscountStrategy discountStrategy = new PercentageDiscountStrategy(0.10);

        // SportsStore 인스턴스 생성 시 할인 전략을 전달
        return new SportsStore("나이키", 10, discountStrategy);
    }
}
