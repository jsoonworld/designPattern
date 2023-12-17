package designPattern.store.v11.controller;

import designPattern.store.v11.model.StoreFactory;
import designPattern.store.v11.model.store.Store;
import designPattern.store.v11.model.store.StoreCreationData;
import designPattern.store.v11.view.InputView;
import designPattern.store.v11.view.OutputView;

public class StoreCreationController {
    private InputView inputView;
    private OutputView outputView;

    public StoreCreationController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public Store createStore(StoreCreationData storeData) {
        Store.StoreBuilder builder = Store.builder()
                .storeType(storeData.getStoreType())
                .contractYears(storeData.getContractYears())
                .size(storeData.getSize())
                .rent(storeData.getRent())
                .location(storeData.getLocation());

        StoreFactory storeFactory = StoreFactory.getFactory(storeData.getStoreType());
        return storeFactory.createStore(builder);
    }
}
