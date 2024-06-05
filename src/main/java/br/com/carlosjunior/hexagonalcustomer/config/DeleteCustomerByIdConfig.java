package br.com.carlosjunior.hexagonalcustomer.config;

import br.com.carlosjunior.hexagonalcustomer.adapters.out.DeleteCustomerByIdAdapter;
import br.com.carlosjunior.hexagonalcustomer.application.core.usecase.DeleteCustomerByIdUseCase;
import br.com.carlosjunior.hexagonalcustomer.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {
    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(FindCustomerByIdUseCase findCustomerByIdUseCase,
                                                               DeleteCustomerByIdAdapter deleteCustomerByIdAdapter
    ) {
        return new DeleteCustomerByIdUseCase(findCustomerByIdUseCase, deleteCustomerByIdAdapter);
    }
}
