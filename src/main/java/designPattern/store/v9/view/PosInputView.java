package designPattern.store.v9.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import designPattern.store.v9.model.PaymentType;

public class PosInputView {
    PosOutputView posOutputView = new PosOutputView();
    Scanner sc = new Scanner(System.in);

    PaymentType[] paymentTypes = PaymentType.values();

    public PaymentType selectPayment() {
        while (true) {
            try {
                int payment = sc.nextInt() - 1; // 정해진 범위 내의 숫자만 입력 받아야 함

                // 입력값 검증
                if (payment < 0 || payment >= paymentTypes.length) {
                    throw new IllegalArgumentException();
                }

                return paymentTypes[payment];

            } catch (InputMismatchException ex) {
                throw new IllegalArgumentException();

            } catch (IllegalArgumentException ex) {
                posOutputView.displayInputErrorMessage();

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
