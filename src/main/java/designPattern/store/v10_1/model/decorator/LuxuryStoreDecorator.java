package designPattern.store.v10_1.model.decorator;

import designPattern.store.v10_1.model.Store;
import designPattern.store.v10_1.model.enums.StoreType;

public class LuxuryStoreDecorator extends StoreDecorator {
    private String storeName;
    private StoreType storeType = StoreType.LUXURY;

    public LuxuryStoreDecorator(Store store, String storeName) {
        super(store);
        this.storeName = storeName;
    }

    @Override
    public void operate() {
        super.operate();

        handleOption();
    }

    private void handleOption() {
        onlyLuxuryFeatures features = new onlyLuxuryFeatures();
        features.specialInfo();
        features.reservation();
        features.lockerRoom();
    }

    // 다른 종류의 Store과는 다른 LuxuryStore만의 기능
    private class onlyLuxuryFeatures {

        private void specialInfo() {
            // 상점 이용 가능 시간(2시간)
            // 수용 가능 인원
        }

        private void reservation() {
            // 예약 관련 기능 (예약 여부, 예약자 수 등)
        }

        private void lockerRoom() {
            // 라커룸 관련 기능
        }
    }

    public String getStoreName() {
        return storeName;
    }

    public StoreType getStoreType() {
        return storeType;
    }

}
