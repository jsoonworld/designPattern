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
                validatePaymentOption(payment);

                return paymentTypes[payment];

            } catch (InputMismatchException ex) {
                posOutputView.displayInputErrorMessage();
                sc.nextLine();

            } catch (IllegalArgumentException ex) {
                posOutputView.displayInputErrorMessage();
            }
        }
    }

    public String receiptRequest() {
        while (true) {
            String request = sc.next();
            if (isValidReceiptRequest(request)) {
                return request;
            } else {
                posOutputView.displayInputErrorMessage();
            }
        }
    }

    // 입력 값 검증 (결제 방식 선택)
    private void validatePaymentOption(int payment) {
        if (payment < 0 || payment >= paymentTypes.length) {
            throw new IllegalArgumentException();
        }
    }

    // 입력 값 검증 (영수증)
    private boolean isValidReceiptRequest(String request) {
        return request.equalsIgnoreCase("Y") || request.equalsIgnoreCase("N");
    }
}
