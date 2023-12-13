package designPattern.store.v10_1.model;

import java.util.HashMap;
import java.util.Map;

public class StoreManager {
    private Map<String, Store> stores;

    public StoreManager() {
        this.stores = new HashMap<>();
    }

    public void addStore(String storeName, Store store) {
        stores.put(storeName, store);
        System.out.println("Store added: " + storeName + ". Total stores: " + stores.size());
    }

    public Store getStore(String storeName) {
        return stores.get(storeName);
    }

    public void removeStore(String storeName) {
        stores.remove(storeName);
    }

    public int getSize() {
        return stores.size();
    }

    public Map<String, Store> getAllStores() {
        return new HashMap<>(stores); 
        // 혹은 stores를 직접 반환하거나, 매장 이름 목록만 반환할 수도 있다
    }

    // 추가적인 관리 기능(예: 모든 매장 목록 조회 등)
}
