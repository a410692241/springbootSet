package com.wei.config;

import lombok.Data;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Data
public class UserConfig {

    private String name;
    //表示当这个类型的bean时存在于spring容器,取消配置了ConditionalOnMissingBean注解的bean,建议用于自动装配
    @ConditionalOnMissingBean
    //表示当这个类型的bean时存在于spring容器,强行配置ConditionalOnBean注解的bean
//    @ConditionalOnBean

    @Bean(name = "user")
    public UserConfig getUserConfig() {
        return new UserConfig("hu");
    }

    public UserConfig(String name) {
        this.name = name;
    }

    public UserConfig() {
    }
}
