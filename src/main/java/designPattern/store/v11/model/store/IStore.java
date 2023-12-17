package designPattern.store.v11.model.store;

import designPattern.store.v11.model.enums.StoreType;

public interface IStore {
    StoreType getStoreType();
    int getContractYears();
    double getSize();
    double getRent();
    String getLocation();
    String getOpeningHours();
}