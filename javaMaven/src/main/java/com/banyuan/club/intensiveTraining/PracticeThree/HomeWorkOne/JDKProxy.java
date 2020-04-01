package com.banyuan.club.intensiveTraining.PracticeThree.HomeWorkOne;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author HanChao
 * @date 2020-03-30 22:02
 * 描述信息：JDK动态代理
 */
public class JDKProxy implements InvocationHandler {

    private Object target;

    public Object newProxy(Object target) {
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(target,args);

        // 增加方法演示
        System.out.println("增加方法===========");
        return result;
    }
}
