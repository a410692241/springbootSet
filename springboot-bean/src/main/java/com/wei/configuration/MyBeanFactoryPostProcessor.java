package com.wei.configuration;

import com.wei.bo.User;
import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @Description: 对一个bean初始化完成的时候进行处理, 所以叫bean工厂后置处理器
 * 以下展示对user这个bean初始化完成之后赋值nickname为huwei
 * @Author: Awake-Hu
 * @Date: 2019/5/21
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanDefinitionRegistryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
//        BeanDefinition user = configurableListableBeanFactory.getBeanDefinition("user");
//        MutablePropertyValues propertyValues = user.getPropertyValues();
//        propertyValues.addPropertyValue("nickname", "huwei");
//        user.setScope(BeanDefinition.SCOPE_SINGLETON);
    }

    //实现方式可以用上面的也可以用下面的,二选一,只不过下面的方法可以动态注入bean
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {
//        for (int i = 0; i < 10; i++) {
//            BeanDefinitionBuilder user = BeanDefinitionBuilder.rootBeanDefinition(User.class);
//            user.addPropertyValue("nickname", "huawei" + i);
//            beanDefinitionRegistry.registerBeanDefinition("user" + i, user.getBeanDefinition());
//        }

    }
}
