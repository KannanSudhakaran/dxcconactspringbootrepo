package com.dxc.lab05restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class Lab05RestapiApplication {

    public static void main(String[] args) {
        var context=SpringApplication.run(Lab05RestapiApplication.class, args);

        Arrays.stream( context.getBeanDefinitionNames())
                .sorted()
                .forEach(System.out::println);

        System.out.println(context.getBeanDefinitionCount());
    }

}
