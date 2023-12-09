package designPattern.store.v9.model;

import designPattern.store.v9.model.factory.LuxuryStoreFactory;
import designPattern.store.v9.model.factory.PcRoomStoreFactory;
import designPattern.store.v9.model.factory.SportsStoreFactory;
import designPattern.store.v9.model.store.Store;

import java.util.HashMap;
import java.util.Map;

public abstract class StoreFactory {
    private static final Map<StoreType, StoreFactory> factoryMap = new HashMap<>();

    static {
        factoryMap.put(StoreType.LUXURY, new LuxuryStoreFactory());
        factoryMap.put(StoreType.SPORTS, new SportsStoreFactory());
        factoryMap.put(StoreType.PC_ROOM, new PcRoomStoreFactory());
    }

    public abstract Store createStore(Store.StoreBuilder builder);

    public static StoreFactory getFactory(StoreType type) {
        StoreFactory factory = factoryMap.get(type);
        if (factory == null) {
            throw new IllegalArgumentException("Invalid store type");
        }
        return factory;
    }
}
