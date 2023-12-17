package designPattern.store.v10.controller;

import designPattern.store.v10.model.enums.StoreType;
import designPattern.store.v10.model.store.Store;
import designPattern.store.v10.view.OutputView;

public class StoreResultController {
    private OutputView outputView;

    public StoreResultController(OutputView outputView) {
        this.outputView = outputView;
    }

    public void displayStoreDetails(Store store, StoreType storeType, String brand) {
        outputView.displayStoreDetails(store, storeType, brand);
    }
}
