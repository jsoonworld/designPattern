package designPattern.store;

import designPattern.store.v8.controller.*;
import designPattern.store.v8.model.Store;
import designPattern.store.v8.model.StoreCreationData;
import designPattern.store.v8.view.InputView;
import designPattern.store.v8.view.OutputView;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        StoreCreationController storeCreationController = new StoreCreationController(inputView, outputView);
        BrandSelectionController brandSelectionController = new BrandSelectionController(inputView);
        LocationSelectionController locationSelectionController = new LocationSelectionController(inputView);
        StoreInputController storeInputController = new StoreInputController(inputView, locationSelectionController);
        StoreResultController storeResultController = new StoreResultController(outputView);

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