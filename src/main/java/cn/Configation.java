package cn;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configation {
    @Bean
    public Object getObj() {
        return new Object();
    }
}