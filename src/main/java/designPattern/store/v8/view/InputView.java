package designPattern.store.v8.view;

import java.util.Scanner;

public class InputView {
    private Scanner scanner = new Scanner(System.in);

    public String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    // 매장 유형 입력 받기
    public String getStoreTypeInput() {
        return getInput("Enter store type (LUXURY, SPORTS, PC_ROOM): ");
    }

    // 계약 연수 입력 받기
    public String getContractYearsInput() {
        return getInput("Enter contract years: ");
    }

    // 크기 입력 받기
    public String getSizeInput() {
        return getInput("Enter size (sqm): ");
    }

    // 임대료 입력 받기
    public String getRentInput() {
        return getInput("Enter rent: ");
    }
}
