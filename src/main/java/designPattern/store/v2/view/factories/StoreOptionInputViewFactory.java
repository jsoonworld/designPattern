//package designPattern.store.v2.view.factories;
//
//import designPattern.store.v2.view.input.LuxuryStoreOptionInputView;
//import designPattern.store.v2.view.interfaces.StoreOptionInputView;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Optional;
//import java.util.function.Supplier;
//
//public class StoreOptionInputViewFactory {
//    private final Map<String, Supplier<StoreOptionInputView>> viewSuppliers;
//
//    public StoreOptionInputViewFactory() {
//        viewSuppliers = new HashMap<>();
//        viewSuppliers.put("Luxury", LuxuryStoreOptionInputView::new);
//    }
//
//    public StoreOptionInputView createInputView(String storeType) {
//        return Optional.ofNullable(viewSuppliers.get(storeType))
//                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 타입입니다.: " + storeType))
//                .get();
//    }
//}
