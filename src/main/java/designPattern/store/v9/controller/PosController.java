package designPattern.store.v9.controller;

import designPattern.store.v9.model.PosSystem;
import designPattern.store.v9.view.PosInputView;
import designPattern.store.v9.view.PosOutputView;

import java.util.Scanner;

public class PosController {
    Scanner sc = new Scanner(System.in);
    private PosSystem posSystem = new PosSystem();
    private PosInputView posInputView = new PosInputView();
    private PosOutputView posOutputView = new PosOutputView();

    int totalCost = 10000;

    // POS 시스템 시작
    public void posSystemStart(int totalCost) {
        posOutputView.displayTotalCost(totalCost);

        String paymentType = selectPayment();
        posSystem.processPayment(totalCost, paymentType);

        needReceipt();

        posOutputView.displayThankYouMessage();
    }

    // 결제 수단 선택
    public String selectPayment() {
        posOutputView.displayPaymentOptions();

        return posInputView.selectPayment();    
    }

    // 영수증 필요 여부 확인
    public void needReceipt() {
        posOutputView.receiptRequest();
        String request = posInputView.receiptRequest();

        if (request.equalsIgnoreCase("Y")) {
            posOutputView.displayReceipt();
        }
    }

    public int getTotalCost() {
        return totalCost;
    }
}
