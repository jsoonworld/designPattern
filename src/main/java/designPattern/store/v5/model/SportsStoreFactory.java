package designPattern.store.v5.model;

public class SportsStoreFactory extends StoreFactory{
    @Override
    public Store createStore() {
        return new Store.StoreBuilder()
                .setContractYears(5)
                .setSize(100.0)
                .setRent(100.0)
                .setLocation("압구정")
                .build();
    }
}
