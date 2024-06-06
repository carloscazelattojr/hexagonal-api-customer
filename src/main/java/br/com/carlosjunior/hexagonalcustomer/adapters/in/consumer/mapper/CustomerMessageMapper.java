package br.com.carlosjunior.hexagonalcustomer.adapters.in.consumer.mapper;

import br.com.carlosjunior.hexagonalcustomer.adapters.in.consumer.message.CustomerMessage;
import br.com.carlosjunior.hexagonalcustomer.application.core.domain.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMessageMapper {

    @Mapping(target = "address", ignore = true)
    @Mapping(source="name", target = "name")
    Customer toCustomer(CustomerMessage customerMessage);

}
