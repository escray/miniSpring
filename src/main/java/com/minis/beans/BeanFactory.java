package com.minis.beans;

public interface BeanFactory {
    // 获取一个 Bean
    Object getBean(String beanName) throws NoSuchBeanDefinitionException;

    Boolean containsBean(String name);

    // 注册一个 BeanDefinition
    void registerBean(BeanDefinition beanDefinition);

    void registerBean(String beanName, Object obj);

    boolean isSingleton(String name);

    boolean isPrototype(String name);

    Class<?> getType(String name);
}
