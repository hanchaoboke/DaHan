package ProgrammingExercises;

/**
 * @author HanChao
 * @date 2020-03-15 06:53
 * 描述信息：小时工类实现员工接口
 */
public class HourlyWorker implements EmployeeInterface {
    private String name;
    private double workTime;
    private double hourSalary;

    public HourlyWorker() {
    }

    public HourlyWorker(String name, double workTime, double hourSalary) {
        this.name = name;
        this.workTime = workTime;
        this.hourSalary = hourSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWorkTime() {
        return workTime;
    }

    public void setWorkTime(double workTime) {
        this.workTime = workTime;
    }

    public double getHourSalary() {
        return hourSalary;
    }

    public void setHourSalary(double hourSalary) {
        this.hourSalary = hourSalary;
    }

    @Override
    public double GetSalary(){
        return (workTime * hourSalary);
    }

    @Override
    public String GetName(){
        return name;
    }

    @Override
    public String toString() {
        return "HourlyWorker{" +
                "name='" + name + '\'' +
                ", workTime=" + workTime +
                ", hourSalary=" + hourSalary +
                '}';
    }
}
