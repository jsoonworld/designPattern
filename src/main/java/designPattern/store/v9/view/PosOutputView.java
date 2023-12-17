package designPattern.store.v9.view;

import designPattern.store.v9.model.PaymentType;

public class PosOutputView {

    // 총 금액 보여주기
    public void displayTotalCost(int totalCost) {
        System.out.println("총 결제 금액은 " + totalCost + "원 입니다.");
    }

    // 결제 수단 선택
    public void displayPaymentOptions() {
        System.out.println("결제 수단을 선택해 주세요:");

        PaymentType[] paymentTypes = PaymentType.values();

        int i = 1;
        for (PaymentType paymentType : paymentTypes) {
            System.out.print(i + ". " + paymentType.name() + "  ");
            i++;
        }
        System.out.println();
    }

    // 영수증 필요 여부 확인
    public void receiptRequest() {
        System.out.println("영수증을 출력하시겠습니까? Y/N");
    }

    // 영수증 출력
    public void displayReceipt() {
        // PosSystem.generateReceipt에서 만든 영수증을 출력하는 로직...
    }

    // 마무리 고정 출력 메세지
    public void displayThankYouMessage() {
        System.out.println("이용해 주셔서 감사합니다.");
    }

    // 입력 오류 발생 시 출력 메세지
    public void displayInputErrorMessage() {
        System.out.println("입력 형식이 잘못되었습니다. 다시 시도하세요");
    }
}
