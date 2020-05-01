package cn;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Person bean = (Person) context.getBean("person");
        Object bean2 = context.getBean("getObj");
        System.err.println(bean2);
    }
}