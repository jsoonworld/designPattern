package designPattern.store.v11.model.factory;

import designPattern.store.v11.model.StoreFactory;
import designPattern.store.v11.model.store.IStore;
import designPattern.store.v11.model.store.LuxuryAndSportsStoreDecorator;
import designPattern.store.v11.model.store.Store;

public class LuxuryStoreFactory extends StoreFactory {

    @Override
    public IStore createStore(Store.StoreBuilder builder) {
        return new LuxuryAndSportsStoreDecorator(builder.build());
    }
}
