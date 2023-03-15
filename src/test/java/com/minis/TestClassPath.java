package com.minis;

import org.junit.jupiter.api.Test;

public class TestClassPath {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        AService aService = (AService)ctx.getBean("aservice");
        aService.sayHello();
    }

    @Test
    public void testAServiceSayHello() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        AService aService = (AService)ctx.getBean("aservice");
        aService.sayHello();
    }

    @Test
    public void HelloWorld() {
        System.out.println("hello world, test");
    }
}
