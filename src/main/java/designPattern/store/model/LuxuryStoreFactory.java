package designPattern.store.model;

public class LuxuryStoreFactory extends StoreFactory {
    @Override
    public Store createStore() {
        return new LuxuryStore("에르메스", 5, false);
    }
}