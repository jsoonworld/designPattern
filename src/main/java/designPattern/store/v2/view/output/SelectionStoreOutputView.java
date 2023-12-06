package designPattern.store.v2.view.output;

public class SelectionStoreOutputView {

    public void displayWelcomeMessage() {
        System.out.println("Welcome! Store Maker 입니다.");
        System.out.println("럭셔리 매장(1), 스포츠 매장(2), PC Room 중 생성하고 싶은 매장의 번호를");
        System.out.println("1개 이상 쉼표로 구분해서 입력해주세요.");
        System.out.println("ex) 1, 3");
    }

    public void displayInputResult(String input) {
        System.out.println("입력 받은 매장 번호: " + input);
    }

}
