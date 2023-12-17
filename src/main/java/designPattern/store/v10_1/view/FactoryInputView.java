package designPattern.store.v10_1.view;

import designPattern.store.v10_1.model.enums.StoreType;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FactoryInputView {
    OutputView outputView = new OutputView();
    FactoryOutputView factoryOutputView = new FactoryOutputView();
    Scanner sc = new Scanner(System.in);

    StoreType[] storeTypes = StoreType.values();

    // 매장 종류 입력
    public StoreType selectStoreType() {
        while (true) {
            try {
                int option = sc.nextInt() - 1; // 정해진 범위 내의 숫자만 입력 받아야 함
                validateOption(option);

                return storeTypes[option];

            } catch (InputMismatchException ex) {
                outputView.displayInputErrorMessage();
                sc.nextLine();

            } catch (IllegalArgumentException ex) {
                outputView.displayInputErrorMessage();
            }
        }
    }

    public String inputStoreName() {
        factoryOutputView.inputStoreName();
        String storeName = sc.next();

        return storeName;
    }

    // 입력 값 검증 (결제 방식 선택)
    private void validateOption(int option) {
        if (option < 0 || option >= storeTypes.length) {
            throw new IllegalArgumentException();
        }
    }

}
