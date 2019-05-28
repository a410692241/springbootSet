package com.wei.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class Config {

    @Value("${my.name}")
    private String name;

    /*配置springBootBean*/
    @Bean
    public FilterRegistrationBean<Filter> registFilter() {
        FilterRegistrationBean<Filter> filterFilterRegistrationBean = new FilterRegistrationBean<>();
        filterFilterRegistrationBean.setName("MyFilter");
        filterFilterRegistrationBean.setFilter(new Filter() {
            @Override
            public void init(FilterConfig filterConfig) throws ServletException {

            }

            @Override
            public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
//                System.out.println("过滤前!"+name);
                filterChain.doFilter(servletRequest, servletResponse);

//                System.out.println("过滤之后!"+name);
            }

            @Override
            public void destroy() {

            }
        });
        filterFilterRegistrationBean.addUrlPatterns("/*");
        return filterFilterRegistrationBean;


    }



}
