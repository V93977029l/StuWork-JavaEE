package com.CGLIB;

// 切面类
public class MyAspect {
    public void exception(){
        System.out.println("异常通知");
    }

    public void check(){
        System.out.println("权限检查");
    }

    public void monitor(){
        System.out.println("性能检测");
    }

    public void log(){
        System.out.println("日志记录");
    }
}