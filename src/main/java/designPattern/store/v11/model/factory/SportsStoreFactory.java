package designPattern.store.v11.model.factory;

import designPattern.store.v11.model.StoreFactory;
import designPattern.store.v11.model.store.Store;

public class SportsStoreFactory extends StoreFactory {
    @Override
    public Store createStore(Store.StoreBuilder builder) {
        return builder.build();
    }
}
