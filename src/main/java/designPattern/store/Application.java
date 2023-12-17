package designPattern.store;


import designPattern.store.v11.controller.factory.ControllerFactory;
import designPattern.store.v11.model.store.IStore;
import designPattern.store.v11.model.store.StoreCreationData;
import designPattern.store.v11.view.InputView;
import designPattern.store.v11.view.OutputView;

public class Application {
    public static void main(String[] args) {
        designPattern.store.v11.view.InputView inputView = new InputView();
        designPattern.store.v11.view.OutputView outputView = new OutputView();
        designPattern.store.v11.controller.factory.ControllerFactory controllerFactory = new ControllerFactory(inputView, outputView);

        StoreCreationData storeData = controllerFactory.createStoreInputController().getStoreCreationData();
        IStore store = controllerFactory.createStoreCreationController().createStore(storeData);

        String brand = controllerFactory.createBrandSelectionController().selectBrand(store.getStoreType());
        controllerFactory.createStoreResultController().displayStoreDetails(store, store.getStoreType(), brand);
    }
}