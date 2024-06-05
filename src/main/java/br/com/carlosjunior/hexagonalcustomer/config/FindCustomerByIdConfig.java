package br.com.carlosjunior.hexagonalcustomer.config;

import br.com.carlosjunior.hexagonalcustomer.adapters.out.FindCustomerByIdAdapter;
import br.com.carlosjunior.hexagonalcustomer.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FindCustomerByIdConfig {

    @Bean
    public FindCustomerByIdUseCase findCustomerByIdUseCase(FindCustomerByIdAdapter findCustomerByIdAdapter) {
        return new FindCustomerByIdUseCase(findCustomerByIdAdapter);
    }
}
