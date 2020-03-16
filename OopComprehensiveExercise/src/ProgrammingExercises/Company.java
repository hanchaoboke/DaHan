package ProgrammingExercises;

import java.util.Arrays;

/**
 * @author HanChao
 * @date 2020-03-14 23:37
 * 描述信息：公司类
 */
public class Company {
    private EmployeeInterface[] employee;

    public Company() {
    }

    public Company(EmployeeInterface[] employee) {
        this.employee = employee;
    }

    public EmployeeInterface[] getEmployee() {
        return employee;
    }

    public void setEmployee(EmployeeInterface[] employee) {
        this.employee = employee;
    }

    // 通过员工的名字来删除员工。
    public void deleteEmployee(String name){
        for (int i = 0; i < employee.length; i++){
            if(this.employee[i].GetName().equalsIgnoreCase(name)){
                this.employee[i] = employee[i];
            }
            this.employee = employee;
        }
    }
    // 通过员工的名字来显示员工的工资。
    public double showSalary(String name) {
        for (int i = 0; i < employee.length; i++) {
            if (this.employee[i].GetName().equalsIgnoreCase(name)) {
                return this.employee[i].GetSalary();
            }
        }
        return 0;
    }
    // 输出所有员工的工资和。
    public double GetAllSalary(){
        double allSalary = 0;
        for (int i = 0; i < employee.length; i++){
            allSalary += employee[i].GetSalary();
        }
        return allSalary;
    }


    @Override
    public String toString() {
        return "Company{" +
                "employee=" + Arrays.toString(employee) +
                '}';
    }
}
