package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = {"org.example.aspect", "org.example.beans"})
@EnableAspectJAutoProxy
public class AppConfig {

    @Bean
    public org.example.aspect.MyAspect myAspect() {
        return new org.example.aspect.MyAspect();
    }
}