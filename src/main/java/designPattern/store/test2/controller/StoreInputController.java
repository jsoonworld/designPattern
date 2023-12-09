package designPattern.store.test2.controller;

import designPattern.store.test2.model.StoreType;
import designPattern.store.test2.view.InputView;

public class StoreInputController {
    private InputView inputView;
    private LocationSelectionController locationSelectionController;

    public StoreInputController(InputView inputView, LocationSelectionController locationSelectionController) {
        this.inputView = inputView;
        this.locationSelectionController = locationSelectionController;
    }

    public StoreType getStoreType() {
        return StoreType.valueOf(inputView.getStoreTypeInput().toUpperCase());
    }

    public int getContractYears() {
        return Integer.parseInt(inputView.getContractYearsInput());
    }

    public double getSize() {
        return Double.parseDouble(inputView.getSizeInput());
    }

    public double getRent() {
        return Double.parseDouble(inputView.getRentInput());
    }

    public String getLocation() {
        return locationSelectionController.selectLocation();
    }
}
