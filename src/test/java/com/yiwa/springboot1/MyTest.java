package com.yiwa.springboot1;

import com.yiwa.springboot1.Springboot1Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Springboot1Application.class)
public class MyTest {
    @Value("${yiwa.title}")
    private String title;
    @Test
    public void test(){
        System.out.println(title);
    }
}
