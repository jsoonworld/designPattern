package designPattern.store.v10.view;

import java.util.Scanner;

public class InputView {
    private Scanner scanner = new Scanner(System.in);

    public String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public String getStoreTypeInput() {
        return getInput("상점 유형을 선택해주세요 (LUXURY, SPORTS, PC_ROOM): ");
    }

    public String getContractYearsInput() {
        System.out.println("계약 기간을 선택해주세요 (ONE_YEAR, THREE_YEARS, FIVE_YEARS): ");
        return scanner.nextLine();
    }

    public String getSizeInput() {
        System.out.println("상점 크기를 선택해주세요 (SMALL [50.0 sqm], MEDIUM [100.0 sqm], LARGE [150.0 sqm]): ");
        return scanner.nextLine();
    }

    public String getRentInput() {
        System.out.println("월세를 선택해주세요 (LOW [300000.0 per month], MEDIUM [500000.0 per month], HIGH [700000.0 per month]): ");
        return scanner.nextLine();
    }
}
