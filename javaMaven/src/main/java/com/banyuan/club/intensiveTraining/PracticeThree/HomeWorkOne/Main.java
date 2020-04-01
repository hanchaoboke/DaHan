package com.banyuan.club.intensiveTraining.PracticeThree.HomeWorkOne;

import com.banyuan.club.ProxyPractice.CGLibProxy;
import com.banyuan.club.ProxyPractice.JDKProxy;
import net.sf.cglib.proxy.Enhancer;

/**
 * @author HanChao
 * @date 2020-03-30 22:02
 * 描述信息：
 */
public class Main {

    public static void main(String[] args) {

        // 静态代理测试
        User u = new StaticProxy(new UserImp());
        u.addUser("张三","123");

        // JDK动态代理测试
        UserImp userImp = new UserImp();
        User user = (User) new JDKProxy().newProxy(userImp);
        user.addUser("张三","123");

    }
}
