package designPattern.store.test2.controller;

import designPattern.store.test2.model.Store;
import designPattern.store.test2.model.StoreType;
import designPattern.store.test2.view.OutputView;

public class StoreResultController {
    private OutputView outputView;

    public StoreResultController(OutputView outputView) {
        this.outputView = outputView;
    }

    public void displayStoreDetails(Store store, StoreType storeType, String brand) {
        outputView.displayStoreDetails(store, storeType, brand);
    }
}
