package designPattern.store;

import designPattern.store.v9.controller.*;
import designPattern.store.v9.controller.factory.ControllerFactory;
import designPattern.store.v9.controller.selection.BrandSelectionController;
import designPattern.store.v9.controller.selection.LocationSelectionController;
import designPattern.store.v9.model.store.Store;
import designPattern.store.v9.model.store.StoreCreationData;
import designPattern.store.v9.view.InputView;
import designPattern.store.v9.view.OutputView;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        ControllerFactory controllerFactory = new ControllerFactory(inputView, outputView);

        StoreCreationController storeCreationController = controllerFactory.createStoreCreationController();
        BrandSelectionController brandSelectionController = controllerFactory.createBrandSelectionController();
        StoreInputController storeInputController = controllerFactory.createStoreInputController();
        StoreResultController storeResultController = controllerFactory.createStoreResultController();

        // 매장 유형 및 속성 입력 받기
        StoreCreationData storeData = storeInputController.getStoreCreationData();

        // 매장 생성
        Store store = storeCreationController.createStore(storeData);

        // 브랜드 선택
        String brand = brandSelectionController.selectBrand(store.getStoreType());

        // 결과 출력
        storeResultController.displayStoreDetails(store, store.getStoreType(), brand);
    }
}