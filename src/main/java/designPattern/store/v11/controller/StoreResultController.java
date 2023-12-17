package designPattern.store.v11.controller;

import designPattern.store.v11.model.enums.StoreType;
import designPattern.store.v11.model.store.IStore;
import designPattern.store.v11.view.OutputView;

public class StoreResultController {
    private OutputView outputView;

    public StoreResultController(OutputView outputView) {
        this.outputView = outputView;
    }

    public void displayStoreDetails(IStore store, StoreType storeType, String brand) {
        outputView.displayStoreDetails(store, storeType, brand);
    }
}
