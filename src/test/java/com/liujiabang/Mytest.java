package com.liujiabang;

import com.liujiabang.dao.SomeService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytest {
    @Test
    public void test01(){
        ApplicationContext ac=new
                ClassPathXmlApplicationContext("applicationContext.xml");
        SomeService service=(SomeService) ac.getBean("someService");
        service.doSome();
    }

}
