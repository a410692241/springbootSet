package com.wei.controller;

import com.wei.bo.User;
import com.wei.bo.UserBO;
import com.wei.dao.UserDao;
import com.wei.scheduled.MyScheduled;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;

import java.lang.reflect.InvocationTargetException;
import java.util.*;

/**
 * @author Awake
 * @time 2018/9/21 10:40
 */
@EnableScheduling
@Controller
public class UserController {

    @Value("${my.name}")
    private String myName;

    @Autowired
    private UserDao userDao;
    @Autowired
    private WebApplicationContext webApplicationContext;

    @RequestMapping(value = "/index/{id}/{name}", method = RequestMethod.GET)
    public String index(@PathVariable("id") Integer id, @PathVariable("name") String name) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, InstantiationException, ClassNotFoundException {
        UserBO userBO = new UserBO();
        userBO.setId(id);
        userBO.setName(name);
        userBO.getObj();
        return "jsp/index";
    }

    @RequestMapping("/hello")
    public String hello(UserBO user) {
        return "jsp/hello";
    }


    @RequestMapping("/err")
    public String error(UserBO user) {
        throw new NullPointerException();
    }

    @RequestMapping("/illegeMath")
    public String o(UserBO user) {
        Integer s = 1 / 0;
        return s.toString();
    }

    @RequestMapping("/quart")
    public void quart() {
        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("定时任务体" + new Date());
            }
        }, 0, 2000);
    }


    /*sprignBoot定时任务(2秒执行一次)*/
    @RequestMapping("/sbQuart")
    public void sbQuart() {
        MyScheduled myScheduled = new MyScheduled();
//        myScheduled.fixedDelay();
//        myScheduled.runScheduled();
    }

    /*springBoot Mybatis测试*/
    @RequestMapping("/mybatis")
    @Transactional
    @ResponseBody
    public Object mybatisTest() {
        User record = new User();
        record.setRealName("hu");
        int user = userDao.insert(record);
        return user;
    }

    @RequestMapping("configTest")
    public void configTest() {
        System.out.println(myName);
    }


    /*thymeleaf条件语句*/
    @RequestMapping("/thymeleaf")
    public String thymeleaf(Model model) {
        model.addAttribute("name", "hu");
        model.addAttribute("age", 16);
        return "HelloThymeleaf";
    }

    /*thymeleaf循环结构*/
    @RequestMapping("/foreach")
    public String foreach(Model model) {
        List<String> eachStr = new ArrayList<>();
        eachStr.add("a");
        eachStr.add("b");
        eachStr.add("c");
        eachStr.add("d");
        model.addAttribute("eachStr", eachStr);
        model.addAttribute("birthday", new Date());
        return "HelloThymeleaf";
    }

    @RequestMapping("/user")
    @ResponseBody
    public Object getUser(Model model) {
        Map<String, User> beansOfType = webApplicationContext.getBeansOfType(User.class);
        return beansOfType;
    }
}
