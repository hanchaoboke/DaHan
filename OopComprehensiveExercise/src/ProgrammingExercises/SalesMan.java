package ProgrammingExercises;

/**
 * @author HanChao
 * @date 2020-03-15 07:02
 * 描述信息：销售员工
 */
public class SalesMan implements EmployeeInterface {

    private String name;
    private double totalSalesAmount;
    private double basePay;

    public SalesMan() {
    }

    public SalesMan(String name, double totalSalesAmount, double basePay) {
        this.name = name;
        this.totalSalesAmount = totalSalesAmount;
        this.basePay = basePay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotalSalesAmount() {
        return totalSalesAmount;
    }

    public void setTotalSalesAmount(double totalSalesAmount) {
        this.totalSalesAmount = totalSalesAmount;
    }

    public double getBasePay() {
        return basePay;
    }

    public void setBasePay(double basePay) {
        this.basePay = basePay;
    }

    @Override
    public String toString() {
        return "SalesMan{" +
                "name='" + name + '\'' +
                ", totalSalesAmount=" + totalSalesAmount +
                ", basePay=" + basePay +
                '}';
    }

    @Override
    public double GetSalary(){
        double royalties = 0;   //提成
        if (totalSalesAmount < 10000){
            royalties = totalSalesAmount * 0.1;
        }
        if(totalSalesAmount >= 10000 && totalSalesAmount <= 100000) {
            royalties = totalSalesAmount * 0.15;
        }
        if(totalSalesAmount > 100000){
            royalties = totalSalesAmount * 0.18;
        }
        return (royalties + basePay);
    }
    @Override
    public String GetName(){
        return name;
    }
}
