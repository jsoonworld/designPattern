package designPattern.store.model.factories;

import designPattern.store.model.interfaces.Store;
import designPattern.store.model.stores.SportsStore;

public class SportsStoreFactory extends StoreFactory {
    @Override
    public Store createStore() {
        return new SportsStore("나이키", 10, false);
    }
}
