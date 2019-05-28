package com.wei;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;

import javax.validation.constraints.NotNull;
import java.util.Collections;
import java.util.List;

@ComponentScan(basePackages = {"com.wei.controller"})
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
        String s = null;
        String m = "s";
        m.equals(s);
//        Object o = Proxy.newProxyInstance(UserBO.class.getClassLoader(), null, null);

    }

    public void ObjNull(@NotNull String str) {
        System.out.println("ss".equals(str));
    }

    @Test
    public void getTnull() {
        ObjNull(null);
    }

    @Test
    public void getIterNull() {
        List list = null;
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
    }


}
