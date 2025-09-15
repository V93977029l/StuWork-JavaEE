package test;

import dao.School;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test_Sch {
    protected static ApplicationContext a;

    public static void main(String[] args) {
        a = new ClassPathXmlApplicationContext("applicationContext.xml");
        School s = a.getBean("school",School.class);
        System.out.println(s);
    }
}
