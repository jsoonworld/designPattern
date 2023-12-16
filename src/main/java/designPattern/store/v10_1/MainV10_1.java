package designPattern.store.v10_1;

import designPattern.store.v10_1.controller.DecoratorController;
import designPattern.store.v10_1.controller.FactoryController;
import designPattern.store.v10_1.model.StoreManager;
import designPattern.store.v10_1.view.InputView;
import designPattern.store.v10_1.view.OutputView;

public class MainV10_1 {
    static OutputView outputView = new OutputView();
    static InputView inputView = new InputView();
    static StoreManager storeManager = new StoreManager();

    public static void main(String[] args) {

        while (true) {
            mainMenu();
        }

    }

    private static void mainMenu() {
        outputView.displayMenu();
        handleMenuOption(inputView.selectMenu());
    }

    private static void handleMenuOption(int option) {
        FactoryController factoryController = new FactoryController();
        DecoratorController decoratorController = new DecoratorController();

        switch (option) {
            case 1:
                factoryController.factorySystemOn(storeManager);
                break;

            case 2:
                decoratorController.decoratorSystemOn(storeManager);
                break;

            case 3:
                exit();
                break;

            default:
                System.out.println("Error");
                break;
        }

    }

    private static void exit() {
        System.out.println("시스템을 종료합니다...");
        System.exit(0);
    }
}
