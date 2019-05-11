package com.example.market.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.nexeo.market.controller", "com.nexeo.market.service", "com.nexeo.market.repository"})
public class MarketProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarketProjectApplication.class, args);
	}

}