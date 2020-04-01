package com.banyuan.club.ProxyPractice;

import net.sf.cglib.proxy.Enhancer;

/**
 * @author HanChao
 * @date 2020-03-30 22:02
 * 描述信息：
 */
public class Main {

    public static void main(String[] args) {

        // JDK动态代理测试
        UserImp userImp = new UserImp();
        User user = (User) new JDKProxy().newProxy(userImp);
        user.addUser("张三","123");

        System.out.println();

        // GCLib动态代理测试
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(UserImp.class);
        enhancer.setCallback(new CGLibProxy());
        UserImp u = (UserImp) enhancer.create();
        u.addUser("张三","123");

    }
}
