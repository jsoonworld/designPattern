package designPattern.store;

<<<<<<< HEAD

=======
>>>>>>> ade7cb24d6cb73946f47a9d24bd0bf4a16e1c8c2
import designPattern.store.v10.controller.factory.ControllerFactory;
import designPattern.store.v10.model.store.Store;
import designPattern.store.v10.model.store.StoreCreationData;
import designPattern.store.v10.view.InputView;
import designPattern.store.v10.view.OutputView;
import designPattern.store.v9.controller.PosController;

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