package designPattern.store.v1.model.factories;

import designPattern.store.v1.model.interfaces.Store;
import designPattern.store.v1.model.stores.LuxuryStore;

public class LuxuryStoreFactory extends StoreFactory {
    @Override
    public Store createStore() {
        return new LuxuryStore("에르메스", 5, true);
    }
}