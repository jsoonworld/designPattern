package designPattern.store;


import designPattern.store.v5.model.*;

public class Application {
    public static void main(String[] args) {
        // 매장 유형 선택 및 팩토리 생성
        StoreType storeType = StoreType.LUXURY;
        StoreFactory storeFactory = StoreFactory.getFactory(storeType);

        // Store.StoreBuilder 객체 생성 및 설정
        Store.StoreBuilder builder = new Store.StoreBuilder()
                .setContractYears(5)
                .setSize(150.0)
                .setRent(4000.0)
                .setLocation("강남");

        // 매장 생성
        Store store = storeFactory.createStore(builder);

        BrandStrategy brandStrategy = new LuxuryBrandStrategy();
        String brand = brandStrategy.selectBrand();

        System.out.println("Selected Luxury Brand: " + brand);

        // 매장의 속성 값 확인 및 출력
        System.out.println("Created a " + storeType + " store");
        System.out.println("Contract Years: " + store.getContractYears());
        System.out.println("Size: " + store.getSize() + " sqm");
        System.out.println("Rent: " + store.getRent() + " per month");
        System.out.println("Location: " + store.getLocation());
    }
}