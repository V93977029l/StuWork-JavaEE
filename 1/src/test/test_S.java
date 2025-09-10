package test;

import dao.Student;
import dao.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test_S {
    protected static ApplicationContext a;

    public static void main(String[] args) {
        a = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student s = (Student) a.getBean("student");
        System.out.println(s);
    }
}
