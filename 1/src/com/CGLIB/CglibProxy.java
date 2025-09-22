package com.CGLIB;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy implements MethodInterceptor {
    public Object createProxy(Object target) {
        // 创建一个类增强器
        Enhancer enhancer = new Enhancer();
        // 设置增强类的父类
        enhancer.setSuperclass(target.getClass());
        // 正确设置回调
        enhancer.setCallback(this);

        return enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        MyAspect myAspect = new MyAspect();
        myAspect.check();
        myAspect.exception();
        // 使用MethodProxy调用父类方法
        Object result = proxy.invokeSuper(obj, args);
        myAspect.log();
        myAspect.monitor();
        return result;
    }
}
