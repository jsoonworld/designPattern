package designPattern.store.v10_1.controller;

import java.util.Map;

import designPattern.store.v10_1.model.BasicStore;
import designPattern.store.v10_1.model.Store;
import designPattern.store.v10_1.model.StoreManager;
import designPattern.store.v10_1.view.DecoratorInputView;
import designPattern.store.v10_1.view.DecoratorOutputView;

public class DecoratorController {
    DecoratorOutputView decoratorOutputView = new DecoratorOutputView();
    DecoratorInputView decoratorInputView = new DecoratorInputView();
    
    private StoreManager storeManager;

    public void decoratorSystemOn(StoreManager storeManager) {
        this.storeManager = storeManager;

        Store store = selectStore();

        showCurrentStoreInfo(store);

    }

    private Store selectStore() {
        decoratorOutputView.displayStoreList(storeManager);

        decoratorOutputView.selectStore();
        int select = decoratorInputView.selectStore(storeManager);

        decoratorOutputView.selectedStore(select);

        return selectedStoreName(select);
    }

    private void showCurrentStoreInfo(Store store) {
        decoratorOutputView.setDecoratorOutputView(store);
        decoratorOutputView.displayStoreOutput();
    }

    private Store selectedStoreName(int select) {
        Map<String, Store> allStores = storeManager.getAllStores();

        int count = 1;
        for (Map.Entry<String, Store> entry : allStores.entrySet()) {
            if (count == select) {
                return entry.getValue();
            }
            count++;
        }

        return new BasicStore(null, null);
    }
    
}
