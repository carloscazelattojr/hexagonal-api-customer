package br.com.carlosjunior.hexagonalcustomer.adapters.out.repository.mapper;

import br.com.carlosjunior.hexagonalcustomer.adapters.out.repository.entity.CustomerEntity;
import br.com.carlosjunior.hexagonalcustomer.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

    Customer toCustomer(CustomerEntity customerEntity);
}
