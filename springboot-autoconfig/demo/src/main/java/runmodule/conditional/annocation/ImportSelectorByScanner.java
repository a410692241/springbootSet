package runmodule.conditional.annocation;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ClassPathBeanDefinitionScanner;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Arrays;

/**
 * @Author Awake-Hu
 * @Description 本类还原了spring如何通过配置@ComponentScan如何通过报名扫描bean
 * @Date 2019/5/24 14:36
 **/
public class ImportSelectorByScanner implements ImportBeanDefinitionRegistrar {


    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        String[] packageNames = (String[]) importingClassMetadata.getAnnotationAttributes(ImportBeanByScanner.class.getName()).get("packageName");
        BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.rootBeanDefinition(ScanBeanPostProcessor.class);
        beanDefinitionBuilder.addPropertyValue("packages", Arrays.asList(packageNames));
        registry.registerBeanDefinition(ScanBeanPostProcessor.class.getName(), beanDefinitionBuilder.getBeanDefinition());
    }

}
