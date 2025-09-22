package com.JDK;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// InvocationHandler接口的实现类
public class JDKProxy implements InvocationHandler {
    // 被代理的对象
    private TestDao testDao;

    // 创建一个方法:建立代理对象和目标对象之间的代理关系,返回代理对象
    public Object createProxy(TestDao testDao) {
        this.testDao = testDao;
        ClassLoader loader = JDKProxy.class.getClassLoader();
        Class<?>[] clazz = testDao.getClass().getInterfaces();
        return Proxy.newProxyInstance(loader, clazz, this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        MyAspect myAspect = new MyAspect();
        // 前置通知
        myAspect.check();
        myAspect.exception();

        // 调用目标对象方法,args:方法的参数
        Object obj = method.invoke(testDao, args);

        // 后置通知
        myAspect.log();
        myAspect.monitor();

        return obj;
    }


}
