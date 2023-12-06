package designPattern.store.v2.view.output;

import java.util.HashMap;
import java.util.Map;

public class SelectionStoreOutputView {

    private static final Map<Integer, String> STORE_NAMES = new HashMap<>();

    static {
        STORE_NAMES.put(1, "럭셔리 매장");
        STORE_NAMES.put(2, "스포츠 매장");
        STORE_NAMES.put(3, "PC Room");
    }

    public void displayWelcomeMessage() {
        System.out.println("Welcome! Store Maker 입니다.");
        System.out.println("럭셔리 매장(1), 스포츠 매장(2), PC Room 중 생성하고 싶은 매장의 번호를");
        System.out.println("1개 이상 쉼표로 구분해서 입력해주세요.");
        System.out.println("ex) 1, 3");
    }

    public void displayInputResult(String input) {
        String[] parts = input.split(",");
        StringBuilder storeNames = new StringBuilder();

        for (String part : parts) {
            int storeNumber = Integer.parseInt(part.trim());
            storeNames.append(STORE_NAMES.get(storeNumber)).append(", ");
        }

        // 마지막 쉼표 제거
        if (storeNames.length() > 0) {
            storeNames.setLength(storeNames.length() - 2);
        }

        System.out.println("선택된 매장: " + storeNames.toString());
    }

    public void displayErrorMessage() {
        System.out.println("[ERROR] 잘못된 입력입니다. 다시 입력해주세요. 예: 1, 2, 3");
    }
}
