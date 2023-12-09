package designPattern.store.v9.model;

// 모든 Store에 존재하는 결제 시스템
public class PosSystem {

    // 결제 진행
    public void processPayment(int totalCost, String paymentType) {
        paymentSequence(paymentType);
    }

    // 결제 과정
    public void paymentSequence(String paymentType) {
        System.out.println(paymentType + "으로 결제 진행 중...");

        for(int i = 0; i < 3; i++){
            System.out.println(".");
        }

        System.out.println("결제가 완료되었습니다.");
    }

    // 영수증 생성
    public String generateReceipt() {
        // 영수증 만드는 로직 ...
        return "영수증 내용";
    }

    // 기타 POS 관련 메서드
}
