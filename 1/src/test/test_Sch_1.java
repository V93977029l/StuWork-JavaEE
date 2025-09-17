package test;

import dao.School_1;
import dao.Student_1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test_Sch_1 {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        School_1 sch = ac.getBean("school_1",School_1.class);
        Student_1 stu = ac.getBean("student_1",Student_1.class);
        System.out.println(sch);
        System.out.println(stu);
    }
}
