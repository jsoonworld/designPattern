package designPattern.store.v10_1.controller;

import designPattern.store.v10_1.view.DecoratorOutputView;

public class DecoratorController {
    DecoratorOutputView decoratorOutputView = new DecoratorOutputView();

    public void decoratorSystemOn() {
        selectStore();
        showCurrentStoreInfo();
    }

    private void selectStore() {
        decoratorOutputView.displayStoreList();
    }

    private void showCurrentStoreInfo() {
        decoratorOutputView.displayStoreOutput();
    }
    
}
