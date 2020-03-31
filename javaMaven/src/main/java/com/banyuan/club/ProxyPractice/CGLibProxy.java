package com.banyuan.club.ProxyPractice;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author HanChao
 * @date 2020-03-30 23:25
 * 描述信息：CGLib动态代理
 */
public class CGLibProxy implements MethodInterceptor {


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        Object obj = methodProxy.invokeSuper(o,objects);

        // 增加方法演示
        System.out.println("增加方法===========");

        return obj;
    }
}
