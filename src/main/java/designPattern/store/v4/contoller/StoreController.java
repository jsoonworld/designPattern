package designPattern.store.v4.contoller;

import designPattern.store.v4.view.input.StoreConfigurationInputView;
import designPattern.store.v4.model.*;

public class StoreController {
    public Store setupStore(String type) {
        StoreConfigurationInputView inputView = new StoreConfigurationInputView();
        String[] config = inputView.setConfiguration().split(",");

        Location location = Location.valueOf(config[0].toUpperCase());
        Size size = mapSizeToEnum(config[1]);
        ContractYear contractYear = ContractYear.valueOf(config[2].toUpperCase());
        Rent rent = Rent.valueOf(config[3].toUpperCase());

        Store store;
        switch (type.toLowerCase()) {
            case "luxury":
                store = new LuxuryStore(location, size, contractYear, rent);
                break;
            // 다른 매장 타입에 대한 케이스 추가
            default:
                throw new IllegalArgumentException("Unknown store type: " + type);
        }

        return store;
    }

    private Size mapSizeToEnum(String sizeInput) {
        switch(sizeInput) {
            case "50":
                return Size.SMALL;
            case "200":
                return Size.MEDIUM;
            case "400":
                return Size.LARGE;
            default:
                throw new IllegalArgumentException("Invalid size: " + sizeInput);
        }
    }
}