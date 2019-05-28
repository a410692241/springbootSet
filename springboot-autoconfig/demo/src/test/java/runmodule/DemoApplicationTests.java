package runmodule;

import com.wei.config.UserConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Resource(name = "user")
    private UserConfig userConfig;

    @Test
    public void contextLoads() {
        System.out.println(userConfig);
    }

}
