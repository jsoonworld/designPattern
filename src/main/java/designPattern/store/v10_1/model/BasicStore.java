package designPattern.store.v10_1.model;

import designPattern.store.v10_1.model.enums.StoreType;

public class BasicStore implements Store {
    private String storeName;
    private StoreType storeType;

    public BasicStore(String storeName, StoreType storeType) {
        this.storeName = storeName;
        this.storeType = storeType;
    }

    @Override
    public void operate() {
        // 기본 매장 운영 로직
    }

    @Override
    public String getStoreName() {
        return storeName;
    }

    @Override
    public StoreType getStoreType() {
        return storeType;
    }

}