package designPattern.store.v10_1.model.decorator;

import designPattern.store.v10_1.model.Store;
import designPattern.store.v10_1.model.enums.StoreType;

public class SportStoreDecorator extends StoreDecorator {
    private String storeName;
    private StoreType storeType = StoreType.SPORT;

    public SportStoreDecorator(Store store, String storeName) {
        super(store);
        this.storeName = storeName;
    }

    @Override
    public void operate() {
        System.out.println("[Store 공통 기능]");
        super.operate();

        System.out.println("\n[Sport매장의 개별 기능]");
        handleOption();
    }

    private void handleOption() {
        onlySportFeatures features = new onlySportFeatures();
        features.lockerRoom();
    }

    private class onlySportFeatures {

        private void specialInfo() {
            // 상점 이용 가능 시간 제한 없음
            // 수용 가능 인원 제한 없음
        }

        private void reservation() {
            // 예약 관련 기능 (예약 여부, 예약자 수 등) 없음
        }

        private void lockerRoom() {
            // 라커룸 관련 기능
            System.out.println("스포츠 매장 라커룸 기능 On");
        }
    }

    public String getStoreName() {
        return storeName;
    }

    public StoreType getStoreType() {
        return storeType;
    }

}
