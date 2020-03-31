package com.banyuan.club.ProxyPractice;

/**
 * @author HanChao
 * @date 2020-03-30 22:01
 * 描述信息：
 */
public class UserImp implements User {
    @Override
    public void addUser(String name, String password) {
        System.out.println("==========调用addUser方法===============");
    }
}
