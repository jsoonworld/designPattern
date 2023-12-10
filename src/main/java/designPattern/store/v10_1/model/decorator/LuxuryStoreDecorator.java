package designPattern.store.v10_1.model.decorator;

import designPattern.store.v10_1.model.Store;

public class LuxuryStoreDecorator extends StoreDecorator {
    public LuxuryStoreDecorator(Store store) {
        super(store);
    }

    @Override
    public void operate() {
        super.operate();
        onlyLuxuryFeatures();
    }

    // 대기열, 수용 인원, 예약자 수, 예약 여부, 라커룸, 이용 가능 시간(2시간)
    private void onlyLuxuryFeatures() {

    }

}
