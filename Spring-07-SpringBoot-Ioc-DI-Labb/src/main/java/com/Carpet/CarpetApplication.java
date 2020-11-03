package com.Carpet;

import com.Carpet.calculator.Calculator;
import com.Carpet.enums.City;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CarpetApplication {

	public static void main(String[] args) throws Exception {

		ApplicationContext container = SpringApplication.run(CarpetApplication.class, args);

		Calculator calculator = container.getBean("calculator",Calculator.class);

		System.out.println(calculator.getTotalCarpetCost(City.AUSTIN));


	}

}
