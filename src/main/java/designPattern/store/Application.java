package designPattern.store;


import designPattern.store.v2.controller.SelectionStoreInputController;
import designPattern.store.v2.view.input.SelectionStoreInputView;
import designPattern.store.v2.view.output.SelectionStoreOutputView;

public class Application {
    public static void main(String[] args) {
        // OutputView와 InputView 객체 생성
        SelectionStoreOutputView outputView = new SelectionStoreOutputView();
        SelectionStoreInputView inputView = new SelectionStoreInputView();

        // Controller 객체 생성 및 사용자 입력 처리 프로세스 시작
        SelectionStoreInputController inputController = new SelectionStoreInputController(outputView, inputView);
        inputController.processUserInput();
    }
}