package designPattern.store.test2.controller;

import designPattern.store.test.model.Store;
import designPattern.store.test.model.StoreFactory;
import designPattern.store.test.model.StoreType;
import designPattern.store.test2.view.StoreView;

public class StoreCreationController {
    private StoreView view;

    public StoreCreationController(StoreView view) {
        this.view = view;
    }

    public Store createStore(StoreType storeType, int contractYears, double size, double rent, String location) {
        Store.StoreBuilder builder = new Store.StoreBuilder()
                .setContractYears(contractYears)
                .setSize(size)
                .setRent(rent)
                .setLocation(location);

        StoreFactory storeFactory = StoreFactory.getFactory(storeType);
        return storeFactory.createStore(builder);
    }
}
