package com.JDK;

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {
        // 创建代理对象
        JDKProxy jdkProxy = new JDKProxy();
        // 创建目标对象
        TestDao testDao = new TestDaoImpl();
        // 获取增强后的目标对象
        TestDao proxy = (TestDao) jdkProxy.createProxy(testDao);
        proxy.save();
        System.out.println("-----------------");
        proxy.modify();
        System.out.println("-----------------");
        proxy.delete();
    }
}
