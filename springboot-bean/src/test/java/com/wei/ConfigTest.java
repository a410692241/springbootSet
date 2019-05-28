package com.wei;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@ComponentScan
@RunWith(SpringRunner.class)
@SpringBootTest
public class ConfigTest {

//    @Value("${my.friend[0]}")
//    private List<String> friendList;


    @Test
    public void getListConfig() {
//        System.out.println(friendList);
    }

}
