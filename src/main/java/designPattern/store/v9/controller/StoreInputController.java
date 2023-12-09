package designPattern.store.v9.controller;

import designPattern.store.v9.model.StoreType;
import designPattern.store.v9.model.store.StoreCreationData;
import designPattern.store.v9.view.InputView;
import designPattern.store.v9.controller.selection.LocationSelectionController;

public class StoreInputController {
    private InputView inputView;
    private LocationSelectionController locationSelectionController;

    public StoreInputController(InputView inputView, LocationSelectionController locationSelectionController) {
        this.inputView = inputView;
        this.locationSelectionController = locationSelectionController;
    }

    public StoreCreationData getStoreCreationData() {
        StoreType storeType = getStoreType();
        int contractYears = getContractYears();
        double size = getSize();
        double rent = getRent();
        String location = getLocation();

        return new StoreCreationData(storeType, contractYears, size, rent, location);
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
