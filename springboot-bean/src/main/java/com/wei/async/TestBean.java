package com.wei.async;

import com.google.gson.Gson;
import com.wei.DemoApplication;
import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.EnableAsync;

import java.util.List;

@ComponentScan
@EnableAsync
public class TestBean {
    @Bean
    public Runnable runnable() {
        return new Runnable() {
            @Override
            public void run() {
                System.out.println("-----运行-----");
            }
        };
    }

    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        Runnable runnable = context.getBean(Runnable.class);
        runnable.run();
        Thread.sleep(10);
        System.out.println(Thread.currentThread().toString());

        System.out.println("运行完成!");
    }

    public static void run(int i) {
        System.out.println(i);
    }

}
