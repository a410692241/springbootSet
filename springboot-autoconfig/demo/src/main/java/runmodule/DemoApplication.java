package runmodule;

import com.google.gson.Gson;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.lang.UsesSunMisc;
import runmodule.conditional.annocation.ImportBeanByBeanName;
import runmodule.conditional.annocation.ImportBeanByScanner;
import runmodule.conditional.annocation.ImportSelectorByScanner;
import runmodule.conditional.bo.Import;
import runmodule.conditional.bo.Person;

import java.util.Map;

/*
 * @Description: 通过配置spring.factories达到导入包的同时自动引入该jar包中的bean到spring容器
 * @Author: Awake-Hu
 * @Date: 2019/5/22 15:22
 */
//@ImportBeanByBeanName(name = Import.class)
@ImportBeanByScanner(packageName = {"runmodule.conditional.bo"})
@SpringBootApplication
public class DemoApplication {
    @Autowired
    private Gson gson;

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        System.out.println("操作系统是:" + context.getEnvironment().getProperty("os.name"));
        System.out.println(context.getBeansOfType(Person.class));
        System.out.println("编码方式为GBK的bean:" + context.getBean("getEncoding"));
        Map<String, Import> beansOfType = context.getBeansOfType(Import.class);
        System.out.println(beansOfType);

        System.out.println("Import:" + beansOfType);
    }

}
