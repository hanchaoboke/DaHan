package com.banyuan.club.intensiveTraining.PracticeThree.HomeWorkOne;

/**
 * @author HanChao
 * @date 2020-04-01 21:07
 * 描述信息：
 */
public class StaticProxy implements User{

    private UserImp userImp;

    public StaticProxy(UserImp userImp) {
        this.userImp = userImp;
    }

    @Override
    public void addUser(String name, String password) {
        System.out.println("=========调用addUser方法");
    }
}
