package designPattern.store.v2.view.input;

import java.util.Scanner;

public class LuxuryStoreOptionInputView {
    private Scanner scanner;

    public LuxuryStoreOptionInputView() {
        this.scanner = new Scanner(System.in);
    }

    public String receiveStoreName() {
        System.out.println("매장의 이름을 다음 중 선택해 주세요");
        System.out.println("에르메스, 루이비통, 샤넬");
        System.out.println("예: 에르메스");
        return scanner.nextLine();
    }

    public int receiveOpeningTime() {
        System.out.println("매장의 오픈 시간을 다음 중 선택해 주세요.");
        System.out.println("9am, 10am, 11am");
        System.out.println("예: 9");
        return Integer.parseInt(scanner.nextLine());
    }

    public int receiveClosingTime() {
        System.out.println("매장의 마감 시간을 다음 중 선택해 주세요");
        System.out.println("9pm, 10pm, 11pm");
        System.out.println("예: 9");
        return Integer.parseInt(scanner.nextLine());
    }

    public int receiveCapacity() {
        System.out.println("매장의 수용 가능 인원을 다음 중 설정해주세요 ");
        System.out.println("3명, 5명, 10");
        System.out.println("예: 3");
        return Integer.parseInt(scanner.nextLine());
    }

    public void closeScanner() {
        scanner.close();
    }
}
