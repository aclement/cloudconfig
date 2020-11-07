package com.example.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class ConfigclientApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConfigclientApplication.class, args);
	}
}

@Component
class CLR implements CommandLineRunner {

	@Value("${foo}")
	String injected;

	@Value("${democonfigclient.message}")
	String message;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("> " + injected);
	}

}
