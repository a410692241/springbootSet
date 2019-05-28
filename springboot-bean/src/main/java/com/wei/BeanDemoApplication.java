package com.wei;

import com.wei.async.Jeep;
import com.wei.async.TestBean;
import com.wei.bo.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.stereotype.Component;

/*
 * @Description: @Import用来导入一个或者多个配置类,作用类似于在类上面加入注解@Component
 * @Author: Awake-Hu
 * @Date: 2019/5/22 11:02
 */
@Component
@EnableAsync
@SpringBootApplication
//@Import(User.class)
public class BeanDemoApplication extends SpringBootServletInitializer {
    @Bean
    public Runnable createRunnable() {
        return new Jeep();
    }


    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(BeanDemoApplication.class, args);
        //查看主配置中的配置
//        String property = context.getEnvironment().getProperty("spring.datasource.driver-class-name");
//        System.out.println(property);

        System.out.println(context.getBean(Runnable.class));
        //通过import引入实体类的bean
        System.out.println(context.getBean(User.class));
    }

}

