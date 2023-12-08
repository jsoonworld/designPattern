package designPattern.store.test2.controller;

import designPattern.store.test2.model.Store;
import designPattern.store.test2.model.StoreFactory;
import designPattern.store.test2.model.StoreType;
import designPattern.store.test2.view.InputView;
import designPattern.store.test2.view.OutputView;

public class StoreCreationController {
    private InputView inputView;
    private OutputView outputView;

    public StoreCreationController(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public Store createStore(StoreType storeType, int contractYears, double size, double rent, String location) {
        // 여기서 inputView와 outputView를 사용할 수도 있고,
        // Store의 생성 로직에만 집중할 수도 있습니다.
        Store.StoreBuilder builder = new Store.StoreBuilder()
                .setContractYears(contractYears)
                .setSize(size)
                .setRent(rent)
                .setLocation(location);

        StoreFactory storeFactory = StoreFactory.getFactory(storeType);
        return storeFactory.createStore(builder);
    }
}
