package annotation.controller;

import annotation.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("testController")
@RequestMapping("/test")
public class TestController {
    @Autowired
    private TestService testService;

    public void test(){
        testService.test();
    }
}
