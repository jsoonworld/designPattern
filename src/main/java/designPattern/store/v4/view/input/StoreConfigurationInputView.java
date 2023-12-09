package designPattern.store.v4.view.input;

import java.util.Scanner;

public class StoreConfigurationInputView {
    private Scanner sc;

    public StoreConfigurationInputView() {
        this.sc = new Scanner(System.in);
    }
    public String setConfiguration() {
        System.out.println("Welcome to store configuration page");

        System.out.println("매장 위치를 선택해주세요. (성수, 압구정, 홍대)");
        System.out.print("입력: ");
        String location = sc.nextLine();

        System.out.println("매장 평수를 선택해주세요. (50, 200, 400)");
        System.out.print("입력: ");
        String size = sc.nextLine();

        System.out.println("매장 계약 년수를 선택해주세요. (3, 5, 10)");
        System.out.print("입력: ");
        String contractYear = sc.nextLine();

        return location + "," + size + "," + contractYear;
    }
}
