package designPattern.store.v9.model;

import designPattern.store.v9.model.factory.LuxuryStoreFactory;
import designPattern.store.v9.model.factory.PcRoomStoreFactory;
import designPattern.store.v9.model.factory.SportsStoreFactory;
import designPattern.store.v9.model.store.Store;

public abstract class StoreFactory {
    public abstract Store createStore(Store.StoreBuilder builder);

    public static StoreFactory getFactory(StoreType type) {
        switch (type) {
            case LUXURY:
                return new LuxuryStoreFactory();
            case SPORTS:
                return new SportsStoreFactory();
            case PC_ROOM:
                return new PcRoomStoreFactory();
            default:
                throw new IllegalArgumentException("Invalid store type");
        }
    }
}
