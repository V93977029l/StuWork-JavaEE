package annotation.service.impl;

import annotation.mapper.TestMapper;
import annotation.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testMapper;

    @Override
    public void test() {
        testMapper.test();
        System.out.println("testService");
    }
}
