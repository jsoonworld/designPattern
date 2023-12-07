package designPattern.store.v3.view.input;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SelectionStoreTypeInputView {
    private Scanner sc;

    public SelectionStoreTypeInputView() {
        this.sc = new Scanner(System.in);
    }

    private String getUserInput(String prompt) {
        System.out.println(prompt);
        return sc.nextLine();
    }

    private void displayOptions(List<String> options) {
        for (String option : options) {
            System.out.println(option);
        }
    }

    public String askForStoreConfiguration() {
        System.out.println("매장 구성을 설정해주세요.");

        List<String> options = Arrays.asList(
                "계약 년수 선택: 1. 3년, 2. 5년, 3. 10년",
                "평수 선택: 1. SMALL(50), 2. MEDIUM(200), 3. LARGE(400)",
                "월세 선택: 1. LOW(5000), 2. MEDIUM(10000), 3. HIGH(50000)",
                "위치 선택: 1. 성수, 2. 압구정, 3. 홍대"
        );

        displayOptions(options);

        String contractYearChoice = getUserInput("계약 년수를 선택하세요:");
        String sizeChoice = getUserInput("평수를 선택하세요:");
        String rentChoice = getUserInput("월세를 선택하세요:");
        String locationChoice = getUserInput("위치를 선택하세요:");

        return contractYearChoice + "," + sizeChoice + "," + rentChoice + "," + locationChoice;
    }

    public String askForStoreTypeChoice() {
        return getUserInput("Welcome! Store Maker 입니다.\n1. 럭셔리 매장, 2. 스포츠 매장, 3. PC Room 중 생성하고 싶은 매장을 선택해서 번호를 입력해주세요.\nex) 1");
    }
}
