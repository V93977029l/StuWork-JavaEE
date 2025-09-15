package dao;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Data
public class School_2 {
    @Value("5")
    private int id;
    @Autowired
    @Qualifier("student_1")
    private Student_1 s_1;
}
