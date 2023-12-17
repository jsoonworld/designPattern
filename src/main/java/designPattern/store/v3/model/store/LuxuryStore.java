package designPattern.store.v3.model.store;

import designPattern.store.v3.model.BrandCharacteristic;
import designPattern.store.v3.model.luxuryBrand.LuxuryBrand;

public class LuxuryStore implements Store {
    private LuxuryBrand brand;
    private BrandCharacteristic characteristic;

    public LuxuryStore(ContractYear contractYear, Size size, Rent rent, Location location, LuxuryBrand brand, BrandCharacteristic characteristic) {

    }

    @Override
    public void displayStoreInfo() {

    }

    @Override
    public void setOperatingHours(String openingTime, String closingTime) {

    }

    @Override
    public String getOperatingHours() {
        return null;
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
}
