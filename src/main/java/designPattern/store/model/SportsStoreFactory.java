package designPattern.store.model;

public class SportsStoreFactory extends StoreFactory {
    @Override
    public Store createStore() {
        return new SportsStore("나이키", 10, false);
    }
}
