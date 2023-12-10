package designPattern.store.v9.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeInputView {
    EmployeeOutputView employeeOutputView = new EmployeeOutputView();

    Scanner sc = new Scanner(System.in);

    // 옵션 선택
    public int getOption() {
        while (true) {
            try {
                int option = sc.nextInt();
                validateOption(option);

                return option;

            } catch (InputMismatchException ex) {
                employeeOutputView.displayInputErrorMessage();
                sc.nextLine();

            } catch (IllegalArgumentException ex) {
                employeeOutputView.displayInputErrorMessage();
            }
        }
    }

    // 입력 값 검증 (메인 메뉴에서 서비스 종류 선택)
    private void validateOption(int option) {
        if (option < 0 || option >= 5) {
            throw new IllegalArgumentException();
        }
    }
}
