package designPattern.store.v10_1.model;

import designPattern.store.v10_1.model.enums.StoreType;

public interface Store {
    void operate();

    String getStoreName();

    StoreType getStoreType();

}
