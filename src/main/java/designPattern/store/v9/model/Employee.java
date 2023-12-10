package designPattern.store.v9.model;

public class Employee {
    int employeeId; // 근로자의 식별 번호.
    String employeeName; // 근로자의 이름.
    double employeeSalary; // 근로자의 급여.
    String employeePosition; // 근로자의 직책.
    double totalHours; // 총 근로 시간.

    public Employee(int employeeId, String employeeName, String employeePosition, double employeeSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeePosition = employeePosition;
        this.employeeSalary = employeeSalary;
    }
}
