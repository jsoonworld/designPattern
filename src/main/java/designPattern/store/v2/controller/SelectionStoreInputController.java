package designPattern.store.v2.controller;

import designPattern.store.v2.view.input.SelectionStoreInputView;
import designPattern.store.v2.view.output.SelectionStoreOutputView;
import designPattern.store.v2.util.SelectionStoreInputValidator;

public class SelectionStoreInputController {

    private SelectionStoreOutputView outputView;
    private SelectionStoreInputView inputView;

    public SelectionStoreInputController(SelectionStoreOutputView outputView, SelectionStoreInputView inputView) {
        this.outputView = outputView;
        this.inputView = inputView;
    }

    public void processUserInput() {
        String input;
        boolean isValid;

        do {
            outputView.displayWelcomeMessage();
            input = inputView.receiveUserInput();
            isValid = SelectionStoreInputValidator.isInputValid(input);

            if (!isValid) {
                outputView.displayErrorMessage();
            }
        } while (!isValid);

        outputView.displayInputResult(input);
    }
}
