package runmodule.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class GBKConditional implements Condition {


    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment environment = context.getEnvironment();
        String coding = environment.getProperty("sun.jnu.encoding");
        if ("GBK".contains(coding)) {
            return true;
        }
        return false;
    }
}
