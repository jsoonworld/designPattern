package designPattern.store.model.factories;

import designPattern.store.model.interfaces.Store;
import designPattern.store.model.stores.LuxuryStore;

public class LuxuryStoreFactory extends StoreFactory {
    @Override
    public Store createStore() {
        return new LuxuryStore("에르메스", 5, true);
    }
}