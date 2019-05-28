package runmodule.conditional.annocation;

import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

import java.util.List;
/**
 * @Author Awake-Hu
 * @Description 检查指定包下的导入到spring中的bean
 * @Date 2019/5/24 16:49
 **/

@Data
public class ScanBeanPostProcessor implements BeanPostProcessor {
    private List<String> packages;

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        for (String aPackage : packages) {
            //如果符合在此包下的bean,则将完整类名打印
            if (bean.getClass().getName().startsWith(aPackage)) {
                System.out.println("bean:" + bean.getClass().getName());
            }
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return null;
    }
}
