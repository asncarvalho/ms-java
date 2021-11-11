package com.leomodulos.hrpayroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class HrPayrollApplication {
	public static void main(String[] args) {
		System.out.println();
		SpringApplication.run(HrPayrollApplication.class, args);
	}

}
