package designPattern.store;


import designPattern.store.v5.model.*;

public class Application {
    public static void main(String[] args) {
        // 1. 매장 유형 선택
        StoreType storeType = StoreType.LUXURY;

        // 2. 매장 팩토리 생성
        StoreFactory storeFactory = StoreFactory.getFactory(storeType);

        // 3. 매장 생성
        Store luxuryStore = storeFactory.createStore();

        // 4. 브랜드 전략 선택
        BrandStrategy brandStrategy = new LuxuryBrandStrategy();
        String brand = brandStrategy.selectBrand();

        System.out.println("Created a " + storeType + " store with brand: " + brand);
    }
}