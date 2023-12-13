package designPattern.store.v10_1.view;

public class OutputView {
    
    public void displayMenu() {
        System.out.println("------------- Menu -------------");
        System.out.println("사용할 기능을 선택해 주세요.");
        System.out.println("1. 새 매장 생성 | 2. 매장 관리");
    }

    public void completeWork() {
        System.out.println("완료되었습니다.");
        System.out.println();
    }

    // 입력 오류 발생 시 출력
    public void displayInputErrorMessage() {
        System.out.println("입력 형식이 잘못되었습니다. 다시 시도하세요.");
    }
}
