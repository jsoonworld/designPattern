package designPattern.store;

import designPattern.store.v9.controller.factory.ControllerFactory;
import designPattern.store.v9.model.store.Store;
import designPattern.store.v9.model.store.StoreCreationData;
import designPattern.store.v9.view.InputView;
import designPattern.store.v9.view.OutputView;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        ControllerFactory controllerFactory = new ControllerFactory(inputView, outputView);

        // 매장 유형 및 속성 입력 받기
        StoreCreationData storeData = controllerFactory.createStoreInputController().getStoreCreationData();

        // 매장 생성
        Store store = controllerFactory.createStoreCreationController().createStore(storeData);

        // 브랜드 선택
        String brand = controllerFactory.createBrandSelectionController().selectBrand(store.getStoreType());

        // 결과 출력
        controllerFactory.createStoreResultController().displayStoreDetails(store, store.getStoreType(), brand);
    }
}