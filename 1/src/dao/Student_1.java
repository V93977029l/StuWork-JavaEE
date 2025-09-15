package dao;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("student_1")
@Data
public class Student_1 {
    @Value("1")
    private int id;
    @Value("张三")
    private String name;
    @Value("20")
    private String age;
    @Value("1")
    private String course;
}
