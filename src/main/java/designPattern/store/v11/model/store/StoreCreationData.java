package designPattern.store.v11.model.store;

import designPattern.store.v11.model.enums.StoreType;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class StoreCreationData {
    private final StoreType storeType;
    private final int contractYears;
    private final double size;
    private final double rent;
    private final String location;
}
