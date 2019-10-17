package com.tdd.lcd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NumberToLcd1Application {

	public static void main(String[] args) {
		SpringApplication.run(NumberToLcd1Application.class, args);
		
		for (int i = 0; i < 5; i++) {
            System.out.println("--- "+Drawer.ToLCDNumber(i));

        }
	}

}
