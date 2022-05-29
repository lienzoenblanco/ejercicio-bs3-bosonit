package com.example.bs3.component;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Clase2 implements CommandLineRunner {
    public void print(){
        System.out.println("Hola desde la clase secundaria");
    }

    @Override
    public void run(String... args) throws Exception {
        this.print();
    }
}
