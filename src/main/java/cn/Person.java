package cn;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @Componet表示把这个类放入IOC容器中
 * @Scope表示作用范围
 */
@Component
@Scope("prototype")
public class Person {
    private String name = "!23";

    @Override
    public String toString() {
        return "this";
    }
}