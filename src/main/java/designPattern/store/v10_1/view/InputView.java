package designPattern.store.v10_1.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputView {
    OutputView outputView = new OutputView();
    Scanner sc = new Scanner(System.in);

    public int selectMenu() {
        while (true) {
            try {
                int option = sc.nextInt(); // 정해진 범위 내의 숫자만 입력 받아야 함
                validateOption(option);

                return option;

            } catch (InputMismatchException ex) {
                outputView.displayInputErrorMessage();
                sc.nextLine();

            } catch (IllegalArgumentException ex) {
                outputView.displayInputErrorMessage();
            }
        }
    }

    // 메인 메뉴 선택
    private void validateOption(int option) {
        if (option < 0 || option > 3) {
            throw new IllegalArgumentException();
        }
    }
}
