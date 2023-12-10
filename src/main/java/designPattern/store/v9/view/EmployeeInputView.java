package designPattern.store.v9.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeInputView {
    EmployeeOutputView employeeOutputView = new EmployeeOutputView();

    Scanner sc = new Scanner(System.in);
    
    public int getOption() {
        while (true) {
            try {
                int option = sc.nextInt();

                if (option < 0 || option >= 4) {
                    throw new IllegalArgumentException();
                }

                return option;

            } catch (InputMismatchException ex) {
                throw new IllegalArgumentException();

            } catch (IllegalArgumentException ex) {
                employeeOutputView.displayInputErrorMessage();
            }
        }
    }
}
