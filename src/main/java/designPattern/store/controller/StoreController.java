package designPattern.store.controller;

import designPattern.store.model.Store;
import designPattern.store.view.StoreView;

public class StoreController {
    private Store store;
    private StoreView view;

    public StoreController(Store store, StoreView view) {
        this.store = store;
        this.view = view;
    }

    public void updateView() {
        view.displayStoreInfo(store);
    }

}