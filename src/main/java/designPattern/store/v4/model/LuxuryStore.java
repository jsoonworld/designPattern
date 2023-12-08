package designPattern.store.v4.model;

public class LuxuryStore implements Store {
    private ContractYear contractYear;
    private Size size;
    private Rent rent;
    private Location location;

    public LuxuryStore(Location location, Size size, ContractYear contractYear, Rent rent) {
        this.location = location;
        this.size = size;
        this.contractYear = contractYear;
        this.rent = rent;
    }

    @Override
    public void setContractYear(ContractYear contractYear) {

    }

    @Override
    public void setSize(Size size) {

    }

    @Override
    public void setRent(Rent rent) {

    }

    @Override
    public void setLocation(Location location) {

    }

    @Override
    public ContractYear getContractYear() {
        return null;
    }

    @Override
    public Size getSize() {
        return null;
    }

    @Override
    public Rent getRent() {
        return null;
    }

    @Override
    public Location getLocation() {
        return null;
    }

    // Store 인터페이스의 메서드 구현
    @Override
    public void displayStoreInfo() {
        System.out.println("Luxury Store");
        System.out.println("Location: " + location);
        System.out.println("Size: " + size.getSquareFeet() + " square feet");
        System.out.println("Contract Year: " + contractYear.getYears() + " years");
        System.out.println("Rent: " + rent.getAmount());
    }
}

