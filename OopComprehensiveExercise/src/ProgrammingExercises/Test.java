package ProgrammingExercises;

/**
 * @author HanChao
 * @date 2020-03-15 08:11
 * 描述信息：一个公司对象；
 * 一个小时工的对象，每小时工资10，工作 200 小时；
 * 一个小时工的对象，每小时工资10，工作 230 小时；
 * 一个销售员工的对象，销售额5000；
 * 一个销售员工的对象，销售额200000；
 * 一个普通员工对象，工作小时205 小时。
 * 将以上员工对象加入公司对象中，然后调用输出所有员工工资和的方法，查看该公司该月应
 * 该发的工资总和。
 */
public class Test {
    public static void main(String[] args) {
        Company company = new Company();
        EmployeeInterface hourWorkerA = new HourlyWorker("小明",200,100);
        EmployeeInterface hourWorkerB = new HourlyWorker("小红",230,10);
        EmployeeInterface salesManA = new SalesMan("销售A",5000,2000);
        EmployeeInterface salesManB = new SalesMan("销售B",200000,3000);
        EmployeeInterface ordinaryStaff = new OrdinaryStaff("普通员工",205,5000);
        EmployeeInterface ordinaryStaffA = new OrdinaryStaff("领便当",300,3000);
        EmployeeInterface jewler = new Jeweler("首饰工人",100);
        EmployeeInterface[] employeeInterfaces = {hourWorkerA,hourWorkerB,salesManA,salesManB,ordinaryStaff,ordinaryStaffA,jewler};
        company.setEmployee(employeeInterfaces);
        company.deleteEmployee("领便当");
        company.showSalary("销售B");
        System.out.println(company.GetAllSalary());
    }
}
