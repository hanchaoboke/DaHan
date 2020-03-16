package ProgrammingExercises;

/**
 * @author HanChao
 * @date 2020-03-15 07:12
 * 描述信息：普通员工
 */
public class OrdinaryStaff implements EmployeeInterface{
    private String name;
    private int hourWork;
    private double basePay;

    public OrdinaryStaff() {
    }

    public OrdinaryStaff(String name, int hourWork, double basePay) {
        this.name = name;
        this.hourWork = hourWork;
        this.basePay = basePay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHourWork() {
        return hourWork;
    }

    public void setHourWork(int hourWork) {
        this.hourWork = hourWork;
    }

    public double getBasePay() {
        return basePay;
    }

    public void setBasePay(double basePay) {
        this.basePay = basePay;
    }

    @Override
    public String toString() {
        return "OrdinaryStaff{" +
                "name='" + name + '\'' +
                ", hourWork=" + hourWork +
                ", basePay=" + basePay +
                '}';
    }

    @Override
    public double GetSalary(){
        double overTimePay = 0;
        if(hourWork > 196){
            overTimePay = (hourWork - 196) * 200;
        }
        return (overTimePay + basePay);
    }

    @Override
    public String GetName(){
        return name;
    }
}
