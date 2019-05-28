package runmodule.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;
/**
 * @Author Awake-Hu
 * @Description @Conditional注解的使用分析,只需要通过实现match方法,即可选择性加载想要的bean
 * @Date 2019/5/23 10:50
 **/
public class WindowsConditional implements Condition {


    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment environment = context.getEnvironment();
        String osName = environment.getProperty("os.name");
        if (osName.contains("Windows")) {
            return true;
        }
        return false;
    }
}
