package designPattern.store.model.factories;


import designPattern.store.model.interfaces.Store;

public abstract class StoreFactory {
    public abstract Store createStore();
}
