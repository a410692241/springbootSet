package runmodule.conditional.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import runmodule.conditional.GBKConditional;
import runmodule.conditional.LinuxConditional;
import runmodule.conditional.WindowsConditional;
import runmodule.conditional.bo.Encoding;
import runmodule.conditional.bo.Person;
/**
 * @Author Awake-Hu
 * @Description
 * @Date 2019/5/23 13:57
 **/
@Configuration
public class Config {
    @Conditional({WindowsConditional.class})
    @Bean(name = "hu")
    public Person getPerson1() {
        return new Person("hu",1);
    }

    @Conditional({LinuxConditional.class})
    @Bean(name = "wei")
    public Person getPerson2() {
        return new Person("wei",2);
    }

    @Conditional({GBKConditional.class})
    @Bean
    public Encoding getEncoding() {
        return new Encoding("GBK");
    }
}
