package designPattern.store.v9.view;

public class EmployeeOutputView {

    // 직원 관리 기능 옵션
    public void displayEmployeeManagerOptions() {
        System.out.println("Select Option");
        System.out.println("1. 직원 목록 | 2. 직원 추가 | 3. 직원 삭제 | 4. 직원 정보 수정");
    }

    // 직원 목록
    public void showEmployeeList() {

    }

    // 직원 추가
    public void displayEmployeeAdd() {
        System.out.println("추가할 직원의 정보를 입력하세요.");
        System.out.println("ex) id | 이름 | 나이 | 직책 | 급여");
    }

    // 직원 삭제
    public void displayEmployeeDel() {
        System.out.println("삭제할 직원의 id를 입력하세요.");
    }

    // 직원 정보 업데이트
    public void displayEmployeeUpdate() {
        System.out.println("정보를 수정할 직원의 id를 입력하세요.");
    }

    // 입력 오류 발생 시 출력 메세지
    public void displayInputErrorMessage() {
        System.out.println("입력 형식이 잘못되었습니다. 다시 시도하세요");
    }

    // 근로자 목록을 사용자에게 표시하는 UI 구성요소
    public class EmployeeListView {

    }

    // 선택된 근로자의 상세 정보를 표시
    public class EmployeeDetailView {

    }

    // 급여 정보 및 계산 결과를 표시
    public class PayrollView {

    }

}
