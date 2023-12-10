package designPattern.store.v10_1.model.factories;

import designPattern.store.v10_1.model.Store;

public abstract class StoreFactory {
    public abstract Store createStore(String storeName);
}
