package designPattern.store.v11.view;

import java.util.Scanner;
import java.util.StringJoiner;

public class InputView {
    private Scanner scanner = new Scanner(System.in);

    private void printHeader(String header) {
        System.out.println("\n==================== " + header + " ====================");
    }

    public String getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public String getStoreTypeInput() {
        printHeader("상점 유형 선택");
        return getInput("상점 유형을 선택해주세요 (LUXURY, SPORTS, PC_ROOM): ");
    }

    public String getContractYearsInput() {
        printHeader("계약 기간 선택");
        return getInput("계약 기간을 선택해주세요 (ONE_YEAR, THREE_YEARS, FIVE_YEARS): ");
    }

    public String getSizeInput() {
        printHeader("상점 크기 선택");
        return getInput("상점 크기를 선택해주세요 (SMALL [50.0 sqm], MEDIUM [100.0 sqm], LARGE [150.0 sqm]): ");
    }

    public String getRentInput() {
        printHeader("월세 선택");
        return getInput("월세를 선택해주세요 (LOW [300000.0 per month], MEDIUM [500000.0 per month], HIGH [700000.0 per month]): ");
    }

    public String getBrandInput(String[] brandOptions) {
        printHeader("브랜드 선택");
        StringJoiner brandOptionsJoiner = new StringJoiner(", ");
        for (String brand : brandOptions) {
            brandOptionsJoiner.add(brand);
        }
        return getInput("입점 가능한 브랜드: " + brandOptionsJoiner.toString() + "\n브랜드 이름을 입력해주세요: ");
    }

    public String getLocationInput(String[] locationOptions) {
        printHeader("위치 선택");
        return getInput("입점 가능한 위치: " + String.join(", ", locationOptions) + "\n위치를 입력해주세요: ");
    }
}
