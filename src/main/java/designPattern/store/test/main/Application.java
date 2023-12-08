package designPattern.store.test.main;

import designPattern.store.v5.model.*;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // 매장 유형 입력 받기
        System.out.print("Enter store type (LUXURY, SPORTS, PC_ROOM): ");
        String storeTypeInput = scanner.nextLine();
        StoreType storeType = StoreType.valueOf(storeTypeInput.toUpperCase());

        // 매장 속성 입력 받기
        System.out.print("Enter contract years: ");
        int contractYears = scanner.nextInt();
        System.out.print("Enter size (sqm): ");
        double size = scanner.nextDouble();
        System.out.print("Enter rent: ");
        double rent = scanner.nextDouble();
        scanner.nextLine(); // 숫자 입력 후 다음 라인을 위한 scanner 버그 수정
        System.out.print("Enter location: ");
        String location = scanner.nextLine();


        // 매장 생성
        // Store.StoreBuilder 객체 생성 및 설정
        Store.StoreBuilder builder = new Store.StoreBuilder()
                .setContractYears(contractYears)
                .setSize(size)
                .setRent(rent)
                .setLocation(location);

// 매장 생성
        StoreFactory storeFactory = StoreFactory.getFactory(storeType);
        Store store = storeFactory.createStore(builder);

// 브랜드 전략 선택 및 브랜드 출력
        BrandStrategy brandStrategy;
        switch (storeType) {
            case LUXURY:
                brandStrategy = new LuxuryBrandStrategy();
                break;
            case SPORTS:
                brandStrategy = new SportsBrandStrategy();
                break;
            case PC_ROOM:
                brandStrategy = new PcRoomBrandStrategy();
                break;
            default:
                throw new IllegalArgumentException("Invalid store type");
        }
        String brand = brandStrategy.selectBrand();

// 결과 출력
        System.out.println("Selected Brand: " + brand);
        System.out.println("Created a " + storeType + " store with the following details:");
        System.out.println("Contract Years: " + store.getContractYears());
        System.out.println("Size: " + store.getSize() + " sqm");
        System.out.println("Rent: " + store.getRent() + " per month");
        System.out.println("Location: " + store.getLocation());

    }
}
