package designPattern.store.v1.model.decorators;

import designPattern.store.v1.items.Item;
import designPattern.store.v1.model.interfaces.Store;
import designPattern.store.v1.model.interfaces.StoreDecorator;

public class SpecialPromotionDecorator implements StoreDecorator {
    private Store store;

    public SpecialPromotionDecorator(Store store) {
        this.store = store;
    }


    @Override
    public void addService() {
        // TODO : 특별 프로모션 추가 로직
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
