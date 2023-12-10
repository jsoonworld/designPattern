package designPattern.store.v10_1.controller;

import designPattern.store.v10_1.model.enums.StoreType;
import designPattern.store.v10_1.model.factories.LuxuryStoreFactory;
import designPattern.store.v10_1.view.FactoryInputView;
import designPattern.store.v10_1.view.FactoryOutputView;

public class FactoryController {
    FactoryInputView factoryInputView = new FactoryInputView();
    FactoryOutputView factoryOutputView = new FactoryOutputView();

    // 팩토리 시스템 시작
    public void factorySystemOn() {
        makeStore();
    }

    // 매장 생성
    private void makeStore() {
        StoreType type = selectStoreType();

        handleMakeOption(type);
    }

    private void handleMakeOption(StoreType type) {
        switch (type) {
            case LUXURY:
                LuxuryStoreFactory luxuryStoreFactory = new LuxuryStoreFactory();
                luxuryStoreFactory.createStore(factoryInputView.inputStoreName());
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
