package runmodule.conditional.annocation;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
/**
 * @Author Awake-Hu
 * @Description 自定义通过实现ImportSelector,可以通过类名/类的class生成对应的Spring管理的对象
 * @Date 2019/5/24 14:01
 **/
public class ImportSelectorByBeanName implements ImportSelector {


    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        Class[] classNames = (Class[]) importingClassMetadata.getAnnotationAttributes(ImportBeanByBeanName.class.getName()).get("name");
        String[] names = new String[classNames.length];
        for (int i = 0; i < classNames.length; i++) {
            names[i] = classNames[i].getName();
        }
        return names;
    }
}
