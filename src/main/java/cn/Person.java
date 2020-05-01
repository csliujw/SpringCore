package cn;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Person {
    private String name = "!23";

    @Override
    public String toString() {
        return "this";
    }
}