package com.elsevier.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SystemApplication {

    public static void main(String[] args) {
        System.out.println("Greeting from A");
        System.out.println("Greeting from hotfix/1.1.1");
        SpringApplication.run(SystemApplication.class, args);
    }

}
