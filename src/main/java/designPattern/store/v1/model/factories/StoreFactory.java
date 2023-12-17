package designPattern.store.v1.model.factories;


import designPattern.store.v1.model.interfaces.Store;

public abstract class StoreFactory {
    public abstract Store createStore();
}
