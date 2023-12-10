package designPattern.store.v10.controller;

import designPattern.store.v10.model.StoreFactory;
import designPattern.store.v10.model.store.Store;
import designPattern.store.v10.model.store.StoreCreationData;
import designPattern.store.v10.view.InputView;
import designPattern.store.v10.view.OutputView;

public class StoreCreationController {
    private InputView inputView;
    private OutputView outputView;

    public StoreCreationController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public Store createStore(StoreCreationData storeData) {
        Store.StoreBuilder builder = new Store.StoreBuilder()
                .setStoreType(storeData.getStoreType())
                .setContractYears(storeData.getContractYears())
                .setSize(storeData.getSize())
                .setRent(storeData.getRent())
                .setLocation(storeData.getLocation());

        StoreFactory storeFactory = StoreFactory.getFactory(storeData.getStoreType());
        return storeFactory.createStore(builder);
    }
}
