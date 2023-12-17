package designPattern.store.v10_1.controller;

import designPattern.store.v10_1.model.Store;
import designPattern.store.v10_1.model.StoreManager;
import designPattern.store.v10_1.model.enums.StoreType;
import designPattern.store.v10_1.model.factories.LuxuryStoreFactory;
import designPattern.store.v10_1.model.factories.SportStoreFactory;
import designPattern.store.v10_1.view.FactoryInputView;
import designPattern.store.v10_1.view.FactoryOutputView;
import designPattern.store.v10_1.view.OutputView;

public class FactoryController {
    OutputView outputView = new OutputView();
    FactoryInputView factoryInputView = new FactoryInputView();
    FactoryOutputView factoryOutputView = new FactoryOutputView();
    
    private StoreManager storeManager;

    public FactoryController(StoreManager storeManager) {
        this.storeManager = storeManager;
    }

    // 팩토리 시스템 시작
    public void factorySystemOn() {

        makeStore();

        outputView.completeWork();
    }

    // 매장 생성
    private void makeStore() {
        StoreType type = selectStoreType();

        handleMakeOption(type);
    }

    // 선택한 옵션에 따른 분기
    private void handleMakeOption(StoreType type) {
    String storeName = factoryInputView.inputStoreName();

        switch (type) {
            case LUXURY:
                LuxuryStoreFactory luxuryStoreFactory = new LuxuryStoreFactory();

                Store luxuryStore = luxuryStoreFactory.createStore(storeName);
                storeManager.addStore(storeName, luxuryStore);
                break;

            case SPORT:
                SportStoreFactory sportStoreFactory = new SportStoreFactory();

                Store sportStore = sportStoreFactory.createStore(storeName);
                storeManager.addStore(storeName, sportStore);
                break;

            case PC_Cafe:
                break;

            default:
                break;
        }

    }

    // 매장 생성 시 매장 종류 선택
    private StoreType selectStoreType() {
        factoryOutputView.selectStoreType();
        return factoryInputView.selectStoreType();
    }

}
