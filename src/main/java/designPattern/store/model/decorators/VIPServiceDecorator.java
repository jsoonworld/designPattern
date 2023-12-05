package designPattern.store.model.decorators;

import designPattern.store.model.interfaces.Store;
import designPattern.store.model.interfaces.StoreDecorator;

public class VIPServiceDecorator implements StoreDecorator {
    private Store store;

    public VIPServiceDecorator(Store store) {
        this.store = store;
    }

    @Override
    public void addService() {
        // TODO : VIP 서비스 추가 로직
    }
}