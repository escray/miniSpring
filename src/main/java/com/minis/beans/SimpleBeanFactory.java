package com.minis.beans;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SimpleBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory{
    private final Map<String, BeanDefinition> beanDefinitions = new ConcurrentHashMap<>(256);

    public SimpleBeanFactory() {
    }

    // getBean，容器的核心方法
    @Override
    public Object getBean(String beanName) throws NoSuchBeanDefinitionException {
        // 先尝试直接拿Bean实例
        Object singleton = this.getSingleton(beanName);
        // 如果此时还没有这个Bean的实例，则获取它的定义来创建实例
        if (singleton == null) {
            // 获取bean的定义
            BeanDefinition beanDefinition = beanDefinitions.get(beanName);
            if (beanDefinition == null) {
                throw new NoSuchBeanDefinitionException();
            }
            try {
                singleton = Class.forName(beanDefinition.getClassName())
                        .getDeclaredConstructor().newInstance();
            } catch (InstantiationException | IllegalAccessException |
                     ClassNotFoundException | InvocationTargetException |
                     NoSuchMethodException e) {
                e.printStackTrace();
            }
            // 新注册这个 bean 实例
            this.registerSingleton(beanName, singleton);
        }
        return singleton;
    }

    @Override
    public Boolean containsBean(String name) {
        return containsBean(name);
    }

    @Override
    public void registerBean(BeanDefinition beanDefinition) {
        this.beanDefinitions.put(beanDefinition.getId(), beanDefinition);
    }

    @Override
    public void registerBean(String beanName, Object obj) {
        this.registerSingleton(beanName, obj);
    }
}