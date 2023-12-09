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
        // 기능 작동 여부 확인을 위한 임시 데이터
        String[] items = { "상품1", "상품2", "상품3" };
        double[] prices = { 1000.0, 2000.0, 1500.0 };
        double subtotal = 0.0;
        double tax = 0.0;
        double total = 0.0;
        double taxRate = 0.1;

        System.out.println("********** 영수증 **********");

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " - " + prices[i] + "원");
            subtotal += prices[i];
        }

        tax = subtotal * taxRate;
        total = subtotal + tax;

        System.out.println("소계: " + subtotal + "원");
        System.out.println("세금: " + tax + "원");
        System.out.println("총계: " + total + "원");

        System.out.println("**************************");
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
