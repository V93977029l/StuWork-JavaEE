package annotation.mapper.impl;

import annotation.mapper.TestMapper;
import org.springframework.stereotype.Repository;

@Repository("testDaoImpl")
public class TestMapperImpl implements TestMapper {
    @Override
    public void test(){
        System.out.println("QAQ");
    }
}
