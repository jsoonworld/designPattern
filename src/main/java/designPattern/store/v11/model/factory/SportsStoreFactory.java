package designPattern.store.v11.model.factory;

import designPattern.store.v11.model.StoreFactory;
import designPattern.store.v11.model.store.IStore;
import designPattern.store.v11.model.store.LuxuryAndSportsStoreDecorator;
import designPattern.store.v11.model.store.Store;
import designPattern.store.v11.util.DesignPatternLogger;

public class SportsStoreFactory extends StoreFactory {
    @Override
    public IStore createStore(Store.StoreBuilder builder) {
        Store store = builder.build();
        DesignPatternLogger.logAndDisplayPattern("Decorator Pattern (Luxury)");
        return new LuxuryAndSportsStoreDecorator(store);
    }
}
