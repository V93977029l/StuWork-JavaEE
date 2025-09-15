package test;

import dao.Mix;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test_M {
    protected static ApplicationContext a;

    public static void main(String[] args) {
        a = new ClassPathXmlApplicationContext("applicationContext.xml");
        Mix m = (Mix) a.getBean("mix");
        System.out.println(m);
    }
}
