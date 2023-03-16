package com.minis;

import com.minis.beans.NoSuchBeanDefinitionException;
import com.minis.context.ClassPathXmlApplicationContext;
import org.junit.jupiter.api.Test;

public class TestClassPath {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        AService aService = null;
        try {
            aService = (AService)ctx.getBean("aservice");
        } catch (NoSuchBeanDefinitionException e) {
            throw new RuntimeException(e);
        }
        aService.sayHello();
    }

    @Test
    public void testAServiceSayHello() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        AService aService = null;
        try {
            aService = (AService)ctx.getBean("aservice");
        } catch (NoSuchBeanDefinitionException e) {
            throw new RuntimeException(e);
        }
        aService.sayHello();
    }

    @Test
    public void HelloWorld() {
        System.out.println("hello world, test");
    }
}
