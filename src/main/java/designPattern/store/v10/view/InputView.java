package designPattern.store.v10.view;

import java.util.Scanner;

public class InputView {
    private Scanner scanner = new Scanner(System.in);

    public String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public String getStoreTypeInput() {
        return getInput("Enter store type (LUXURY, SPORTS, PC_ROOM): ");
    }

    public String getContractYearsInput() {
        System.out.println("Enter contract years (ONE_YEAR, THREE_YEARS, FIVE_YEARS): ");
        return scanner.nextLine();
    }

    public String getSizeInput() {
        System.out.println("Enter size (SMALL, MEDIUM, LARGE): ");
        return scanner.nextLine();
    }

    public String getRentInput() {
        System.out.println("Enter rent (LOW, MEDIUM, HIGH): ");
        return scanner.nextLine();
    }
}
