package designPattern.store.v8.controller;

import designPattern.store.v8.model.Store;
import designPattern.store.v8.model.StoreType;
import designPattern.store.v8.view.OutputView;

public class StoreResultController {
    private OutputView outputView;

    public StoreResultController(OutputView outputView) {
        this.outputView = outputView;
    }

    public void displayStoreDetails(Store store, StoreType storeType, String brand) {
        outputView.displayStoreDetails(store, storeType, brand);
    }
}
