package designPattern.store.v11.model;

import designPattern.store.v11.model.enums.StoreType;
import designPattern.store.v11.model.factory.LuxuryStoreFactory;
import designPattern.store.v11.model.factory.PcRoomStoreFactory;
import designPattern.store.v11.model.factory.SportsStoreFactory;
import designPattern.store.v11.model.store.IStore;
import designPattern.store.v11.model.store.Store.StoreBuilder;

import java.util.HashMap;
import java.util.Map;

public abstract class StoreFactory {
    private static final Map<StoreType, StoreFactory> factoryMap = new HashMap<>();

    static {
        factoryMap.put(StoreType.LUXURY, new LuxuryStoreFactory());
        factoryMap.put(StoreType.SPORTS, new SportsStoreFactory());
        factoryMap.put(StoreType.PC_ROOM, new PcRoomStoreFactory());
    }

    public abstract IStore createStore(StoreBuilder builder);

    public static StoreFactory getFactory(StoreType type) {
        StoreFactory factory = factoryMap.get(type);
        if (factory == null) {
            throw new IllegalArgumentException("Invalid store type");
        }
        return factory;
    }
}
