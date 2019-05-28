package com.wei;

import com.google.gson.Gson;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.List;

/* 
 * @Description: 相比@configuration注解,@EnableAutoConfiguration加载spring-boot-autoconfigure下的META-INF
                    下的spring.factories中定义的bean类,用于自动装配外部jar包中的bean;@configuration更多用于
                    加载本项目的bean
 * @Author: Awake-Hu 
 * @Date: 2019/5/22 14:41
 */
@ComponentScan(basePackages = {"com"})
//@MapperScan(basePackages = {"com.wei.dao"})
@SpringBootApplication
public class SpringBeanApplication extends SpringBootServletInitializer {

    //以下则来自自定义装配
    //{createGson={serializeNulls:false,factories:[Factory[typeHierarchy=com.google.gson.JsonElement,adapter=com.google.gson.internal.bind.TypeAdapters$29@4cdcffb2], com.google.gson.internal.bind.ObjectTypeAdapter$1@2de96c2d, com.google.gson.internal.Excluder@1c4e55d, Factory[type=java.lang.String,adapter=com.google.gson.internal.bind.TypeAdapters$16@7e9220f2], Factory[type=java.lang.Integer+int,adapter=com.google.gson.internal.bind.TypeAdapters$7@551871fd], Factory[type=java.lang.Boolean+boolean,adapter=com.google.gson.internal.bind.TypeAdapters$3@33f6f777], Factory[type=java.lang.Byte+byte,adapter=com.google.gson.internal.bind.TypeAdapters$5@153e1259], Factory[type=java.lang.Short+short,adapter=com.google.gson.internal.bind.TypeAdapters$6@7ac435bc], Factory[type=java.lang.Long+long,adapter=com.google.gson.internal.bind.TypeAdapters$11@6cc53480], Factory[type=java.lang.Double+double,adapter=com.google.gson.Gson$1@680c2b20], Factory[type=java.lang.Float+float,adapter=com.google.gson.Gson$2@d4550a2], Factory[type=java.lang.Number,adapter=com.google.gson.internal.bind.TypeAdapters$14@5677fd63], Factory[type=java.util.concurrent.atomic.AtomicInteger,adapter=com.google.gson.TypeAdapter$1@13d3b219], Factory[type=java.util.concurrent.atomic.AtomicBoolean,adapter=com.google.gson.TypeAdapter$1@1a8fce68], Factory[type=java.util.concurrent.atomic.AtomicLong,adapter=com.google.gson.TypeAdapter$1@3de84ddb], Factory[type=java.util.concurrent.atomic.AtomicLongArray,adapter=com.google.gson.TypeAdapter$1@541d23e0], Factory[type=java.util.concurrent.atomic.AtomicIntegerArray,adapter=com.google.gson.TypeAdapter$1@5ad00000], Factory[type=java.lang.Character+char,adapter=com.google.gson.internal.bind.TypeAdapters$15@3e4879bc], Factory[type=java.lang.StringBuilder,adapter=com.google.gson.internal.bind.TypeAdapters$19@41316d3b], Factory[type=java.lang.StringBuffer,adapter=com.google.gson.internal.bind.TypeAdapters$20@7c0e54de], Factory[type=java.math.BigDecimal,adapter=com.google.gson.internal.bind.TypeAdapters$17@26049b5f], Factory[type=java.math.BigInteger,adapter=com.google.gson.internal.bind.TypeAdapters$18@5bfc83ba], Factory[type=java.net.URL,adapter=com.google.gson.internal.bind.TypeAdapters$21@11ee654b], Factory[type=java.net.URI,adapter=com.google.gson.internal.bind.TypeAdapters$22@1fc86b0c], Factory[type=java.util.UUID,adapter=com.google.gson.internal.bind.TypeAdapters$24@1d14c5c9], Factory[type=java.util.Currency,adapter=com.google.gson.TypeAdapter$1@224a6482], Factory[type=java.util.Locale,adapter=com.google.gson.internal.bind.TypeAdapters$28@40ec99bd], Factory[typeHierarchy=java.net.InetAddress,adapter=com.google.gson.internal.bind.TypeAdapters$23@1ca00aa7], Factory[type=java.util.BitSet,adapter=com.google.gson.TypeAdapter$1@27a1ae77], com.google.gson.internal.bind.DateTypeAdapter$1@56bea075, Factory[type=java.util.Calendar+java.util.GregorianCalendar,adapter=com.google.gson.internal.bind.TypeAdapters$27@72bbea6e], com.google.gson.internal.bind.TimeTypeAdapter$1@6ed233ac, com.google.gson.internal.bind.SqlDateTypeAdapter$1@44aafa17, com.google.gson.internal.bind.TypeAdapters$26@673457ff, com.google.gson.internal.bind.ArrayTypeAdapter$1@4af139ed, Factory[type=java.lang.Class,adapter=com.google.gson.TypeAdapter$1@35413c4c], com.google.gson.internal.bind.CollectionTypeAdapterFactory@26a802b1, com.google.gson.internal.bind.MapTypeAdapterFactory@63663234, com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory@201b41e4, com.google.gson.internal.bind.TypeAdapters$30@1c84aaf7, com.google.gson.internal.bind.ReflectiveTypeAdapterFactory@7adf8e5c],instanceCreators:{}}}
//    @Bean
//    public TestBean getTestBean() {
//        return new TestBean();
//    }

    @Bean
    public Gson createGson() {
        return new Gson();
    }

    private Logger logger = LoggerFactory.getLogger(getClass());


    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBeanApplication.class, args);
        //查看主配置中的配置
//        String property = context.getEnvironment().getProperty("spring.datasource.driver-class-name");
        System.out.println(context.getBean(Runnable.class));
        System.out.println(context.getBean(List.class));
        //gson存在于GsonAutoConfiguration类中自动装配,只要引入Gson的包即可
        //{Gson={serializeNulls:false,factories:[Factory[typeHiera...}
        System.out.println(context.getBeansOfType(Gson.class));
    }

}

