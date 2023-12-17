package designPattern.store.v3.controller.factories;

import designPattern.store.v3.model.BrandCharacteristic;
import designPattern.store.v3.model.luxuryBrand.LuxuryBrand;
import designPattern.store.v3.model.store.*;

public class StoreFactory {
    public static Store createStore(String type, ContractYear year, Size size, Rent rent, Location location, LuxuryBrand brand, BrandCharacteristic characteristic) {
        switch (type) {
            case "Luxury":
                return new LuxuryStore(year, size, rent, location, brand, characteristic);
            default:
                throw new IllegalArgumentException("[ERROR] 유요하지 않은 타입입니다.: " + type + ")");
        }
    }
}

