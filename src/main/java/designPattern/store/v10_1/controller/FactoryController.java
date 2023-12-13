package designPattern.store.v10_1.controller;

import designPattern.store.v10_1.model.Store;
import designPattern.store.v10_1.model.StoreManager;
import designPattern.store.v10_1.model.enums.StoreType;
import designPattern.store.v10_1.model.factories.LuxuryStoreFactory;
import designPattern.store.v10_1.view.FactoryInputView;
import designPattern.store.v10_1.view.FactoryOutputView;
import designPattern.store.v10_1.view.OutputView;

public class FactoryController {
    OutputView outputView = new OutputView();
    FactoryInputView factoryInputView = new FactoryInputView();
    FactoryOutputView factoryOutputView = new FactoryOutputView();
    StoreManager storeManager = new StoreManager();

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
        switch (type) {
            case LUXURY:
                LuxuryStoreFactory luxuryStoreFactory = new LuxuryStoreFactory();

                String storeName = factoryInputView.inputStoreName();

                System.out.println("Creating luxury store...");
                Store luxuryStore = luxuryStoreFactory.createStore(storeName);
                System.out.println("Luxury store created");

                System.out.println("Adding store to manager...");
                storeManager.addStore(storeName, luxuryStore);
                System.out.println("Store added to manager.");

                break;

            case SPORT:
                break;

            case PC:
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