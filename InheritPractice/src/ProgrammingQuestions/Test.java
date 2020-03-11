package ProgrammingQuestions;

import java.util.Scanner;

/**
 * @author HanChao
 * @date 2020-03-11 23:07
 * 描述信息：
 * C写一个测试程序。
 * (1)创建一个Customer ,名字叫 Jane Smith, 他有一个账号为1000,余额为2000元,年利率为 1.23% 的账户。
 * (2)对Jane Smith操作。
 * 存入 100 元,再取出960元。再取出2000元。打印出Jane Smith 的基本信息
 * 成功存入 :100.0,成功取出:960.0,余额不足,取款失败
 * Customer [Smith, Jane] has a account: id is 1000, annualInterestRate is 1.23%, balance is 1140.0
 * 上面这句话是Customer 类里面的一个display方法 被调用时候 就输出类似语句
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Account account = new Account(1000,2000,1.23);
        Customer customer = new Customer("Jane","Smith");
        customer.setAccount(account);
        System.out.printf("成功存入 ");
        customer.setBalance(sc.nextDouble());

        System.out.printf("取出 ");

        // 计划取出的钱
        double annualRate = 0.0;
        annualRate = sc.nextDouble();
        customer.withdraw(annualRate);

        System.out.println(customer.display());

    }

}
