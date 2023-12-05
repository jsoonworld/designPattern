package designPattern.store.model.interfaces;

/**
 * The Store interface defines the essential operations that all store implementations must provide. It acts as a blueprint for a store management system, encapsulating the main functionalities required for effective store operation.
 * 
 * <ul>
 * <li><b>재고 관리 시스템</b> - 보유(판매)하고 있는 물품의 종류와 남은 수량 파악, 부족한 재고 주문 </li>
 * <li><b>Point of Sale (POS)</b> - 구매 목록(영수증) 작성, 결제 수단 선택, 할인 및 환불 기능 </li>
 * <li><b>근로자 관리 시스템</b> - 근로자 목록, 근로자 관리, 근로자 급여, 근로 시간 관리 </li>
 * <li><b>보고 및 분석 도구</b> - 판매량 기록, 일정 기간(하루, 일주일, ...) 수익 기록 </li>
 * </ul>
 *
 * Implementing classes are expected to provide concrete implementations of these functionalities.
 */
public interface Store {
    void openStore();
    void closeStore();
    String getName();
    int getCapacity();
    boolean isOpen();
}
