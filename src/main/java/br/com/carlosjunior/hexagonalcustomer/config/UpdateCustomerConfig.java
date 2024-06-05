package br.com.carlosjunior.hexagonalcustomer.config;

import br.com.carlosjunior.hexagonalcustomer.adapters.out.FindAddressByZipCodeAdapter;
import br.com.carlosjunior.hexagonalcustomer.adapters.out.UpdateCustomerAdapter;
import br.com.carlosjunior.hexagonalcustomer.application.core.usecase.FindCustomerByIdUseCase;
import br.com.carlosjunior.hexagonalcustomer.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            UpdateCustomerAdapter updateCustomerAdapter
    ) {
        return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAddressByZipCodeAdapter, updateCustomerAdapter);
    }

}
