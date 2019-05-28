package com.wei.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
    public class Myconfig {
        @Bean
        public List getList() {
            return new ArrayList<>();
        }

    }