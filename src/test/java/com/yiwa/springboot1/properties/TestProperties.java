package com.yiwa.springboot1.properties;

import com.yiwa.springboot1.MyTest;
import com.yiwa.springboot1.config.OtherProperties;
import com.yiwa.springboot1.config.YiwaProperties;
import org.junit.Test;

import javax.annotation.Resource;

public class TestProperties extends MyTest {

    @Resource
    private YiwaProperties yiwaProperties;
    @Resource
    private OtherProperties otherProperties;

    @Test
    public void test(){
        System.out.println("title:"+yiwaProperties.getTitle());
        System.out.println("description:"+yiwaProperties.getDescription());
        System.out.println("hello.title:"+otherProperties.getTitle());
        System.out.println("hello.blob:"+otherProperties.getBlog());
    }

}
