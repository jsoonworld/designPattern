package designPattern.store.v11.controller.selection;

import designPattern.store.v11.view.InputView;
import designPattern.store.v11.model.enums.Location;

import java.util.Arrays;

public class LocationSelectionController {
    private final InputView inputView;

    public LocationSelectionController(InputView inputView) {
        this.inputView = inputView;
    }

    public String selectLocation() {
        String[] locationOptions = Arrays.stream(Location.values())
                .map(Location::getDisplayName)
                .toArray(String[]::new);

        return inputView.getLocationInput(locationOptions);
    }
}

