package com.CGLIB;

public class Test {
    public static void main(String[] args) {
        TestDao testDao = new TestDao();
        CglibProxy cglibProxy = new CglibProxy();
        TestDao proxy = (TestDao) cglibProxy.createProxy(testDao);
        proxy.save();
        System.out.println("-----------------");
        proxy.modify();
        System.out.println("-----------------");
        proxy.delete();
    }
}
