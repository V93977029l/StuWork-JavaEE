package test;

import dao.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test_P {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Person person1_1 = ac.getBean("person1",Person.class);
        Person person1_2 = ac.getBean("person1",Person.class);
        Person person2_1 = ac.getBean("person2",Person.class);
        Person person2_2 = ac.getBean("person2",Person.class);
        System.out.println(person1_1==person1_2);
        System.out.println(person2_1==person2_2);
    }
}
