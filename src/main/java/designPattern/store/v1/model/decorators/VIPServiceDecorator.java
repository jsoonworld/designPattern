package designPattern.store.v1.model.decorators;

import designPattern.store.v1.items.Item;
import designPattern.store.v1.model.interfaces.Store;
import designPattern.store.v1.model.interfaces.StoreDecorator;

public class VIPServiceDecorator implements StoreDecorator {
    private Store store;

    public VIPServiceDecorator(Store store) {
        this.store = store;
    }

    @Override
    public void addService() {
        // TODO : VIP 서비스 추가 로직
    }

    @Override
    public boolean purchaseItem(Item item, int quantity) {
        return false;
    }

    @Override
    public boolean isSaleAllowed() {
        return false;
    }
}
