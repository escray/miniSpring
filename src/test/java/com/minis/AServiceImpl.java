package com.minis;

public class AServiceImpl implements AService {


    private String name;
    private int level;
    private String property1;
    private String property2;

    public String getProperty1() {
        return property1;
    }

    public String getProperty2() {
        return property2;
    }

    public AServiceImpl() {
    }

    public AServiceImpl(String name, int level) {
        this.name = name;
        this.level = level;
        System.out.println(this.name + ", " + this.level);
    }

    @Override
    public void sayHello() {
        System.out.println("a service 1 say hello.");
    }
}
