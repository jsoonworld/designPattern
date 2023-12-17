package designPattern.store.v11.controller;

import designPattern.store.v11.model.enums.StoreType;
import designPattern.store.v11.model.store.Store;
import designPattern.store.v11.view.OutputView;

public class StoreResultController {
    private OutputView outputView;

    public StoreResultController(OutputView outputView) {
        this.outputView = outputView;
    }

    public void displayStoreDetails(Store store, StoreType storeType, String brand) {
        outputView.displayStoreDetails(store, storeType, brand);
    }
}
