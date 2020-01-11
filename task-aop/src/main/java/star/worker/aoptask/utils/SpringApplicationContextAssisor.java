package star.worker.aoptask.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * spring环境工具类
 *
 * @author ZX
 * @create 2020-01-11 17:50
 **/

@Component
public class SpringApplicationContextAssisor implements ApplicationContextAware {

    private static ApplicationContext applicationContext;


    @Override
    public  void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringApplicationContextAssisor.applicationContext = applicationContext;
    }

    public static Object getBeanDefinition(String beanName) {
        return applicationContext.getBean(beanName);
    }

    public static <T> T getBeanDefinition(String beanName,Class<T> beanClass){
        return applicationContext.getBean(beanName, beanClass);
    }
}
