package com.wei;

import com.wei.dao.UserDao;
import com.wei.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.websocket.servlet.WebSocketServletAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import sun.rmi.runtime.Log;

@SpringBootApplication(exclude = WebSocketServletAutoConfiguration.class)
public class SpringbootAutoConfigLogApplication {

    public static void main(String[] args) throws Exception {
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootAutoConfigLogApplication.class, args);
        UserDao userDao = context.getBean(UserDao.class);
        userDao.log();
        System.out.println("-------------------------");
        UserService userService = context.getBean(UserService.class);
        userService.log();
    }

}
