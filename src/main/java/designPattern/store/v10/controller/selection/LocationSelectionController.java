package designPattern.store.v10.controller.selection;

import designPattern.store.v10.view.InputView;

public class LocationSelectionController {
    private static final String[] LOCATION_OPTIONS = {"성수", "신사", "홍대"};
    private final InputView inputView;

    public LocationSelectionController(InputView inputView) {
        this.inputView = inputView;
    }

    public String selectLocation() {
        return inputView.getLocationInput(LOCATION_OPTIONS);
    }
}

