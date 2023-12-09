package designPattern.store;

import designPattern.store.v9.controller.PosController;
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

        StoreCreationData storeData = controllerFactory.createStoreInputController().getStoreCreationData();
        Store store = controllerFactory.createStoreCreationController().createStore(storeData);
        String brand = controllerFactory.createBrandSelectionController().selectBrand(store.getStoreType());
        controllerFactory.createStoreResultController().displayStoreDetails(store, store.getStoreType(), brand);

        // PosSystem 작동 확인
        PosController posController = new PosController();
        posController.posSystemStart(posController.getTotalCost());

        // // 직원 관리 시스템 작동 확인 (현재 작업 중)
        // EmployeeController employeeController = new EmployeeController();
        // employeeController.employeeControllerStart();
    }
}