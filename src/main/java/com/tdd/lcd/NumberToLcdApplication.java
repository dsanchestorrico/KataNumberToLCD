package com.tdd.lcd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NumberToLcdApplication {

	public static void main(String[] args) {
		SpringApplication.run(NumberToLcdApplication.class, args);
		int cont = 0;
		while (cont <= 5) {
			System.out.println(Drawer.ToLCDNumber((int)(Math.random()* 99999)+1));	
			cont++;
		}		
	}

}
