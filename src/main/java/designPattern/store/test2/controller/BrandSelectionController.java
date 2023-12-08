package designPattern.store.test2.controller;

import designPattern.store.test2.model.*;

import static designPattern.store.test.model.StoreType.LUXURY;

public class BrandSelectionController {
    public String selectBrand(StoreType storeType) {
        BrandStrategy brandStrategy = getBrandStrategy(storeType);
        return brandStrategy.selectBrand();
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
