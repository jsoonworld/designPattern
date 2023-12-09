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

        StoreCreationData storeData = controllerFactory.createStoreInputController().getStoreCreationData();

        Store store = controllerFactory.createStoreCreationController().createStore(storeData);

        String brand = controllerFactory.createBrandSelectionController().selectBrand(store.getStoreType());

        controllerFactory.createStoreResultController().displayStoreDetails(store, store.getStoreType(), brand);
    }
}