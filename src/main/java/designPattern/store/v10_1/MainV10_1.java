package designPattern.store.v10_1;

import designPattern.store.v10_1.controller.DecoratorController;
import designPattern.store.v10_1.controller.FactoryController;
import designPattern.store.v10_1.view.InputView;
import designPattern.store.v10_1.view.OutputView;

public class MainV10_1 {
    static OutputView outputView = new OutputView();
    static InputView inputView = new InputView();

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
                factoryController.factorySystemOn();
                break;

            case 2:
                decoratorController.decoratorSystemOn();
                break;

            default:
                System.out.println("Error");
                break;
        }

    }
}
