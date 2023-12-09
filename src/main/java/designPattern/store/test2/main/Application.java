package designPattern.store.test2.main;

import designPattern.store.test2.controller.*;
import designPattern.store.test2.model.Store;
import designPattern.store.test2.view.InputView;
import designPattern.store.test2.view.OutputView;
import designPattern.store.test2.model.StoreType;

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
        StoreType storeType = storeInputController.getStoreType();
        int contractYears = storeInputController.getContractYears();
        double size = storeInputController.getSize();
        double rent = storeInputController.getRent();
        String location = storeInputController.getLocation();

        // 매장 생성
        Store store = storeCreationController.createStore(storeType, contractYears, size, rent, location);

        // 브랜드 선택
        String brand = brandSelectionController.selectBrand(storeType);

        // 결과 출력
        storeResultController.displayStoreDetails(store, storeType, brand);
    }
}
