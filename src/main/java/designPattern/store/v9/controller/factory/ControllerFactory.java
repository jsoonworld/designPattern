package designPattern.store.v9.controller.factory;

import designPattern.store.v9.controller.*;
import designPattern.store.v9.controller.selection.BrandSelectionController;
import designPattern.store.v9.controller.selection.LocationSelectionController;
import designPattern.store.v9.view.InputView;
import designPattern.store.v9.view.OutputView;

// ControllerFactory 클래스를 추가합니다.
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

