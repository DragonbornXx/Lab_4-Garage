package org.example.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

    @Before("execution(* org.example.beans.Garage.someGarageMethod(..))")
    public void beforeSomeGarageMethod() {
        System.out.println("Before calling someGarageMethod");
    }

    @After("execution(* org.example.beans.Garage.someGarageMethod(..))")
    public void afterSomeGarageMethod() {
        System.out.println("After calling someGarageMethod");
    }
}