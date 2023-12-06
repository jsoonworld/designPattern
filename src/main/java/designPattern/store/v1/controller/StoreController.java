package designPattern.store.v1.controller;

import designPattern.store.v1.model.interfaces.Store;
import designPattern.store.v1.view.StoreView;

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

    public void openStore() {
        store.openStore();
        updateView();
    }

    public void closeStore() {
        store.closeStore();
        updateView();
    }

}