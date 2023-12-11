package designPattern.store.v10_1.model.decorator;

import designPattern.store.v10_1.model.Store;

public class StoreDecorator implements Store {
    protected Store store;

    public StoreDecorator(Store store) {
        this.store = store;
    }

    public void operate() {
        store.operate();
    }

}
