package designPattern.store.test2.main;

import designPattern.store.test2.controller.LocationSelectionController;
import designPattern.store.test2.controller.StoreResultController;
import designPattern.store.test2.model.Store;
import designPattern.store.test2.view.InputView;
import designPattern.store.test2.view.OutputView;
import designPattern.store.test2.controller.BrandSelectionController;
import designPattern.store.test2.controller.StoreCreationController;
import designPattern.store.test2.model.StoreType;

public class Application {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        StoreCreationController storeCreationController = new StoreCreationController(inputView, outputView);
        BrandSelectionController brandSelectionController = new BrandSelectionController(inputView);
        LocationSelectionController locationSelectionController = new LocationSelectionController(inputView);
        StoreResultController storeResultController = new StoreResultController(outputView);


        // 매장 유형 및 속성 입력 받기
        StoreType storeType = StoreType.valueOf(inputView.getInput("Enter store type (LUXURY, SPORTS, PC_ROOM): ").toUpperCase());
        int contractYears = Integer.parseInt(inputView.getInput("Enter contract years: "));
        double size = Double.parseDouble(inputView.getInput("Enter size (sqm): "));
        double rent = Double.parseDouble(inputView.getInput("Enter rent: "));
        String location = locationSelectionController.selectLocation();

        // 매장 생성
        Store store = storeCreationController.createStore(storeType, contractYears, size, rent, location);

        // 브랜드 선택
        String brand = brandSelectionController.selectBrand(storeType);

        // 결과 출력
        storeResultController.displayStoreDetails(store, storeType, brand);
    }
}
