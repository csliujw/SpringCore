package cn;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 这个是配置类
 * @Configuration表明是一个配置类
 * @ComponentScan表示对那些包进行扫描，被扫描到的包中的类凡是加了注解的都会被放到IOC容器中去
 * @Import表示 把其他配置类导入
 */
@Configuration
@ComponentScan(basePackages = "cn")
@Import(Configation.class)
public class JavaConfig {
}