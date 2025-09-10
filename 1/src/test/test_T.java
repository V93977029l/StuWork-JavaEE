package test;

import dao.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test_T {
    protected static ApplicationContext a;

    public static void main(String[] args) {
        a = new ClassPathXmlApplicationContext("applicationContext.xml");
        Teacher t = (Teacher) a.getBean("teacher");
        System.out.println(t);
    }
}
