package designPattern.store.v10_1.controller;

import designPattern.store.v10_1.model.StoreManager;
import designPattern.store.v10_1.view.DecoratorInputView;
import designPattern.store.v10_1.view.DecoratorOutputView;

public class DecoratorController {
    DecoratorOutputView decoratorOutputView = new DecoratorOutputView();
    DecoratorInputView decoratorInputView = new DecoratorInputView();
    
    private StoreManager storeManager;

    public void decoratorSystemOn(StoreManager storeManager) {
        this.storeManager = storeManager;

        selectStore();

    }

    private void selectStore() {
        decoratorOutputView.displayStoreList(storeManager);

        decoratorOutputView.selectStore();
        int select = decoratorInputView.selectStore(storeManager);
        decoratorOutputView.selectedStore(select);
    }

    private void showCurrentStoreInfo() {
        decoratorOutputView.displayStoreOutput();
    }
    
}
