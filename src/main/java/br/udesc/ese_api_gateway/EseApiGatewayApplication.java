package br.udesc.ese_api_gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EseApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(EseApiGatewayApplication.class, args);
	}

}
