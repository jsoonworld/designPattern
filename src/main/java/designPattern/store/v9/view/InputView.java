package designPattern.store.v9.view;

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
        return getInput("Enter contract years: ");
    }

    public String getSizeInput() {
        return getInput("Enter size (sqm): ");
    }

    public String getRentInput() {
        return getInput("Enter rent: ");
    }
}
