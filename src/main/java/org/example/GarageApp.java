package org.example;

import org.example.beans.Garage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GarageApp {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Garage garage = (Garage) context.getBean("garage");
        System.out.println(garage);
    }
}