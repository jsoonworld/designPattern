package designPattern.store.model;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class StoreFactory {
    private static final Map<String, Supplier<Store>> storeMap = new HashMap<>();

    static {
        storeMap.put("Luxury", LuxuryStore::new);
        storeMap.put("Sports", SportsStore::new);
        storeMap.put("PCRoom", PCRoomStore::new);
    }

    public Store createStore(String type) {
        Supplier<Store> storeSupplier = storeMap.get(type);
        if (storeSupplier != null) {
            return storeSupplier.get();
        }
        return null;
    }
}
