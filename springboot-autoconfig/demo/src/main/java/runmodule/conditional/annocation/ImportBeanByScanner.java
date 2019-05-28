package runmodule.conditional.annocation;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(ImportSelectorByScanner.class)
public @interface ImportBeanByScanner {
    String[] packageName();
}
