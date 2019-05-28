package com.wei.configuration;

import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Description: 对bean创建进行前置后置操作
 * @Author: Awake-Hu
 * @Date: 2019/5/21
 */
@Component
public class EchoBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//        System.out.println("----------------创建了这个" + bean.getClass()+"bean之前");
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//        System.out.println("----------------创建了这个" + bean.getClass()+"bean之后");

        return bean;
    }


}
