package designPattern.store.v11.model.factory;

import designPattern.store.v11.model.StoreFactory;
import designPattern.store.v11.model.store.IStore;
import designPattern.store.v11.model.store.PcRoomStoreDecorator;
import designPattern.store.v11.model.store.Store;

public class PcRoomStoreFactory extends StoreFactory {
    @Override
    public IStore createStore(Store.StoreBuilder builder) {
        IStore store = builder.build();
        return new PcRoomStoreDecorator(store);
    }
}