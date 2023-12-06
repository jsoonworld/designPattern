package designPattern.store.v2.factories;

import designPattern.store.v2.model.interfaces.Store;
import designPattern.store.v2.model.stores.LuxuryStore;

public class LuxuryStoreFactory {

    public Store createStore(String name) {
        return new LuxuryStore(name);
    }
}
