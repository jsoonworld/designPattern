package designPattern.store.v10.controller.factory;

import designPattern.store.v10.controller.StoreCreationController;
import designPattern.store.v10.controller.StoreInputController;
import designPattern.store.v10.controller.StoreResultController;
import designPattern.store.v10.controller.selection.BrandSelectionController;
import designPattern.store.v10.controller.selection.LocationSelectionController;
import designPattern.store.v10.view.InputView;
import designPattern.store.v10.view.OutputView;

public class ControllerFactory {
    private final InputView inputView;
    private final OutputView outputView;

    public ControllerFactory(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public StoreCreationController createStoreCreationController() {
        return new StoreCreationController(inputView, outputView);
    }

    public BrandSelectionController createBrandSelectionController() {
        return new BrandSelectionController(inputView);
    }

    public LocationSelectionController createLocationSelectionController() {
        return new LocationSelectionController(inputView);
    }

    public StoreInputController createStoreInputController() {
        return new StoreInputController(inputView, createLocationSelectionController());
    }

    public StoreResultController createStoreResultController() {
        return new StoreResultController(outputView);
    }
}

