package com.leomodulos.hrpayroll;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableCircuitBreaker
@EnableFeignClients
@SpringBootApplication
@EnableEurekaClient
public class HrPayrollApplication {
	public static void main(String[] args) {
		System.out.println();
		SpringApplication.run(HrPayrollApplication.class, args);
	}

}
