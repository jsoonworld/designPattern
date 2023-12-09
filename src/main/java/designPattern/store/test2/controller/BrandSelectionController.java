package designPattern.store.test2.controller;

import designPattern.store.test2.model.*;


public class BrandSelectionController {
    public String selectBrand(StoreType storeType, String brandName) {
        BrandStrategy brandStrategy = getBrandStrategy(storeType);
        return brandStrategy.selectBrand(brandName); // brandName 파라미터 추가
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
