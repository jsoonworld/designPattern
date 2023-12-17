package designPattern.store.v9.model;

// 모든 Store에 존재하는 결제 시스템
public class PosSystem {

    // 결제 진행
    public void processPayment(int totalCost, PaymentType paymentType) {
        paymentSequence(paymentType);
    }

    // 결제 과정
    public void paymentSequence(PaymentType paymentType) {
        System.out.println(paymentType + "(으)로 결제 진행 중...");

        for(int i = 0; i < 3; i++){
            System.out.println(".");
        }

        System.out.println("결제가 완료되었습니다.");
    }

    // 영수증 생성
    public void generateReceipt() {
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

    // 기타 POS 관련 메서드
}
