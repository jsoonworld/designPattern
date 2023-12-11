package designPattern.store.v9.controller;

import designPattern.store.v9.model.PaymentType;
import designPattern.store.v9.model.PosSystem;
import designPattern.store.v9.view.PosInputView;
import designPattern.store.v9.view.PosOutputView;

import java.util.Scanner;

public class PosController {
    Scanner sc = new Scanner(System.in);
    private PosSystem posSystem = new PosSystem();
    private PosInputView posInputView = new PosInputView();
    private PosOutputView posOutputView = new PosOutputView();

    // 임시로 하드코딩, 추후에 금액 합계 구하는 메서드 만들어야 함
    int totalCost = 10000;

    // POS 시스템 시작
    public void posSystemStart(int totalCost) {
        posOutputView.displayTotalCost(totalCost);

        PaymentType paymentType = selectPayment();
        posSystem.processPayment(totalCost, paymentType);

        needReceipt();

        posOutputView.displayThankYouMessage();
    }

    // 결제 수단 선택
    public PaymentType selectPayment() {
        posOutputView.displayPaymentOptions();

        return posInputView.selectPayment();    
    }

    // 영수증 필요 여부 확인
    public void needReceipt() {
        posOutputView.receiptRequest();
        String request = posInputView.receiptRequest();

        if (request.equalsIgnoreCase("Y")) {
            posSystem.generateReceipt();
            posOutputView.displayReceipt();
        }
    }

    public int getTotalCost() {
        return totalCost;
    }
}
