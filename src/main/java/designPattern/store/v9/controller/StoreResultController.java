package designPattern.store.v9.controller;

import designPattern.store.v9.model.StoreType;
import designPattern.store.v9.model.store.Store;
import designPattern.store.v9.view.OutputView;

public class StoreResultController {
    private OutputView outputView;

    public StoreResultController(OutputView outputView) {
        this.outputView = outputView;
    }

    public void displayStoreDetails(Store store, StoreType storeType, String brand) {
        outputView.displayStoreDetails(store, storeType, brand);
    }
}
