package br.com.api_gatway.pog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class PogApplication {

	public static void main(String[] args) {
		SpringApplication.run(PogApplication.class, args);
	}

}
