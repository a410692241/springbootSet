package com.wei;

import com.wei.configuration.EchoBeanPostProcessor;
import com.wei.configuration.ServerPortConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
/**
 * @Author Awake-Hu
 * @Description 请注意@EnableConfigurationProperties注解。该注解是用来开启对@ConfigurationProperties注解配置Bean的支持。也就是@EnableConfigurationProperties注解告诉Spring Boot 能支持@ConfigurationProperties
 * @Date 2019/5/23 15:55
 **/
@ComponentScan
@EnableConfigurationProperties(ServerPortConfig.class)
public class EnableConfigurationPropertiesTest {

    @Autowired
    private ServerPortConfig serverPortConfig;



    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(EnableConfigurationPropertiesTest.class, args);
        ServerPortConfig serverPortConfig = (ServerPortConfig) context.getBean(ServerPortConfig.class);
        System.out.println(serverPortConfig.getName());

    }
}
