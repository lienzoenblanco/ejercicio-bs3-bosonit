package com.example.bs3.component;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Clase1 {
    @PostConstruct()
    private void print(){
        System.out.println("Hola desde la clase inicial");
    }
}
