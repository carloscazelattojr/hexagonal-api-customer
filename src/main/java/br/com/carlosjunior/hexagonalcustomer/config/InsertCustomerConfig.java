package br.com.carlosjunior.hexagonalcustomer.config;

import br.com.carlosjunior.hexagonalcustomer.adapters.out.FindAddressByZipCodeAdapter;
import br.com.carlosjunior.hexagonalcustomer.adapters.out.InsertCustomerAdapter;
import br.com.carlosjunior.hexagonalcustomer.adapters.out.SendCpfValidationAdapter;
import br.com.carlosjunior.hexagonalcustomer.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {

    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
                                                       InsertCustomerAdapter insertCustomerAdapter,
                                                       SendCpfValidationAdapter sendCpfValidationAdapter) {
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter, sendCpfValidationAdapter);
    }
}
