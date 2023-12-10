package designPattern.store.v9.controller;

import designPattern.store.v9.model.EmployeeManager;
import designPattern.store.v9.view.EmployeeInputView;
import designPattern.store.v9.view.EmployeeOutputView;

public class EmployeeController {
    EmployeeManager employeeManager = new EmployeeManager();
    EmployeeInputView employeeInputView = new EmployeeInputView();
    EmployeeOutputView employeeOutputView = new EmployeeOutputView();

    // 관리자 실행
    public void employeeManagerSystemStart() {
        employeeManager.managerStart();

        employeeOutputView.displayEmployeeManagerOptions();
        showMainMenu();
    }

    // 메인 메뉴
    private void showMainMenu(){
        int option = employeeInputView.getOption();
        handleOptions(option);
    }

    // 옵션 관리
    private void handleOptions(int option) {
        switch (option) {
            case 1:
                showEmployeeList();
                break;
            case 2:
                employeeAdd();
                break;
            case 3:
                employeeDel();
                break;
            case 4:
                employeeUpdate();
                break;
            default:
                employeeOutputView.displayInputErrorMessage();
        }
    }

    // 직원 목록
    private void showEmployeeList() {
        employeeOutputView.showEmployeeList();

    }

    // 직원 추가
    private void employeeAdd() {
        employeeOutputView.displayEmployeeAdd();

    }

    // 직원 삭제
    private void employeeDel() {
        employeeOutputView.displayEmployeeDel();

    }

    // 직원 정보 수정
    private void employeeUpdate() {
        employeeOutputView.displayEmployeeUpdate();

    }

    // 메인 메뉴 이동
    private void backMainMenu() {
        showMainMenu();
    }

    // 사용자의 입력에 따라 EmployeeManager 및 PayrollCalculator와 상호작용하고, View를 업데이트합니다.

    // 급여 계산과 관련된 사용자의 입력을 처리하고, 계산 결과를 View에 표시합니다
}
