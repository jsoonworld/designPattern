package designPattern.store.v10_1.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import designPattern.store.v10_1.model.StoreManager;

public class DecoratorInputView {
    OutputView outputView = new OutputView();
    Scanner sc = new Scanner(System.in);

    public int selectStore() {
        while (true) {
            try {
                int store = sc.nextInt(); // 정해진 범위 내의 숫자만 입력 받아야 함
                validateOption(store);

                return store;

            } catch (InputMismatchException ex) {
                outputView.displayInputErrorMessage();
                sc.nextLine();

            } catch (IllegalArgumentException ex) {
                outputView.displayInputErrorMessage();
            }
        }
    }

    private void validateOption(int store) {
        StoreManager storeManager = new StoreManager();
        if (store < 0 || store > storeManager.getSize()) {
            throw new IllegalArgumentException();
        }
    }

}
