package br.com.carlosjunior.hexagonalcustomer;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = "br.com.carlosjunior.hexagonalcustomer")
@EnableFeignClients
public class HexagonalcustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(HexagonalcustomerApplication.class, args);
	}

}
