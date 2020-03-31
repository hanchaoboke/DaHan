package com.banyuan.club.ProxyPractice;

/**
 * @author HanChao
 * @date 2020-03-31 00:42
 * 描述信息：
 * 写出一个线程安全的单例模式
 * 这个是线程安全的懒汉模式
 */
public class LazySingleton {
    private static LazySingleton instance;

    private LazySingleton() {
    }

    public static synchronized LazySingleton getInstance() {
        if (null == instance) {
            instance = new LazySingleton();
        }
        return instance;
    }

}
