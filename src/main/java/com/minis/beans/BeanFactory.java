package com.minis.beans;

public interface BeanFactory {
    // 获取一个 Bean
    Object getBean(String beanName) throws NoSuchBeanDefinitionException;

    // 注册一个 BeanDefinition
    void registerBeanDefinition(BeanDefinition beanDefinition);
}
