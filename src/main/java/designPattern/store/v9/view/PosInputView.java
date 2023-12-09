package designPattern.store.v9.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PosInputView {
    PosOutputView posOutputView = new PosOutputView();
    Scanner sc = new Scanner(System.in);

    public String selectPayment() {
        String[] paymentType = { "현금", "신용카드 / PAY", "무통장입금" };

        while (true) {
            try {
                int payment = sc.nextInt() - 1;

                // 입력값 검증
                if (payment < 0 || payment >= paymentType.length) {
                    throw new IllegalArgumentException();
                }

                return paymentType[payment];

            } catch (IllegalArgumentException ex) {
                posOutputView.displayInputErrorMessage();

            } catch (InputMismatchException ex) {
                throw new IllegalArgumentException();
            }
        }
    }

    public String receiptRequest() {
        while (true) {
            try {
                String request = sc.next(); // Y 또는 N 만 입력 받아야 함 (대소문자 구분 X)

                if (!request.equalsIgnoreCase("Y") && !request.equalsIgnoreCase("N")) {
                    throw new IllegalArgumentException();
                }

                return request;

            } catch (IllegalArgumentException ex) {
                posOutputView.displayInputErrorMessage();
            }
        }
    }
}
