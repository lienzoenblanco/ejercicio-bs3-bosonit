package com.example.bs3.component;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Clase3 implements CommandLineRunner {
    public void print(){
        System.out.println("Soy la tercera clase");
    }

    @Override
    public void run(String... args) throws Exception {
        for(String arg:args) {
            System.out.println(arg);
        }
        this.print();
    }
}
