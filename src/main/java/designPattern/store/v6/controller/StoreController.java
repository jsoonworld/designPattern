package designPattern.store.v6.controller;

import designPattern.store.v6.view.StoreView;
import designPattern.store.v5.model.*;

public class StoreController {
    private StoreView view;

    public StoreController(StoreView view) {
        this.view = view;
    }

    public void createAndDisplayStore() {
        // 매장 유형 입력 받기
        String storeTypeInput = view.getInput("Enter store type (LUXURY, SPORTS, PC_ROOM): ");
        StoreType storeType = StoreType.valueOf(storeTypeInput.toUpperCase());

        // 매장 속성 입력 받기
        int contractYears = Integer.parseInt(view.getInput("Enter contract years: "));
        double size = Double.parseDouble(view.getInput("Enter size (sqm): "));
        double rent = Double.parseDouble(view.getInput("Enter rent: "));
        String location = view.getInput("Enter location: ");

        // 매장 생성
        Store.StoreBuilder builder = new Store.StoreBuilder()
                .setContractYears(contractYears)
                .setSize(size)
                .setRent(rent)
                .setLocation(location);

        StoreFactory storeFactory = StoreFactory.getFactory(storeType);
        Store store = storeFactory.createStore(builder);

        // 브랜드 전략 선택 및 브랜드 출력
        BrandStrategy brandStrategy = getBrandStrategy(storeType);
        String brand = brandStrategy.selectBrand();

        // 결과 출력
        view.displayMessage("Selected Brand: " + brand);
        view.displayMessage("Created a " + storeType + " store with the following details:");
        view.displayMessage("Contract Years: " + store.getContractYears());
        view.displayMessage("Size: " + store.getSize() + " sqm");
        view.displayMessage("Rent: " + store.getRent() + " per month");
        view.displayMessage("Location: " + store.getLocation());
    }

    private BrandStrategy getBrandStrategy(StoreType storeType) {
        switch (storeType) {
            case LUXURY:
                return new LuxuryBrandStrategy();
            case SPORTS:
                return new SportsBrandStrategy();
            case PC_ROOM:
                return new PcRoomBrandStrategy();
            default:
                throw new IllegalArgumentException("Invalid store type");
        }
    }
}
