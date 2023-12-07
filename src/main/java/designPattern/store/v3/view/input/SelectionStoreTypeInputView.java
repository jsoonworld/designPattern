package designPattern.store.v3.view.input;

import java.util.Scanner;

public class SelectionStoreTypeInputView {
    private Scanner sc = new Scanner(System.in);
    public String askForStoreTypeChoice() {
        System.out.println("Welcome! Store Maker 입니다.");
        System.out.println("1. 럭셔리 매장, 2. 스포츠 매장, 3. PC Room 중 생성하고 싶은 매장을 선택해서 번호를 입력해주세요.");
        System.out.println("ex) 1");
        return sc.nextLine();
    }
}
