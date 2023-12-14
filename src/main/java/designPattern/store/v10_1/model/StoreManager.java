package designPattern.store.v10_1.model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StoreManager {
    private Map<String, Store> stores;

    public StoreManager() {
        this.stores = new HashMap<>();
    }

    public void addStore(String storeName, Store store) {
        stores.put(storeName, store);
        System.out.println("Store added: " + storeName + ". Total stores: " + stores.size());
    }

    // public Store getStore(String storeName) {
    // return stores.get(storeName);
    // }

    public void removeStore(String storeName) {
        stores.remove(storeName);
    }

    public int getSize() {
        return stores.size();
    }

    public Map<String, Store> getAllStores() {
        return new HashMap<>(stores);
    }

    public void printAllStoreNamesAndTypes() {
        Map<String, Store> allStores = getAllStores();
        for (Map.Entry<String, Store> entry : allStores.entrySet()) {
            String storeName = entry.getKey();
            Store store = entry.getValue();
            System.out.println(storeName + " (" + store.getStoreType() + ")");
        }
    }

    // 추가적인 관리 기능(예: 모든 매장 목록 조회 등)
}
