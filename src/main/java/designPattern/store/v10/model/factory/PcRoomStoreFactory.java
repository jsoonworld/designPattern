package designPattern.store.v10.model.factory;

import designPattern.store.v10.model.StoreFactory;
import designPattern.store.v10.model.store.Store;

public class PcRoomStoreFactory extends StoreFactory {
    @Override
    public Store createStore(Store.StoreBuilder builder) {
        return builder.build();
    }
}
