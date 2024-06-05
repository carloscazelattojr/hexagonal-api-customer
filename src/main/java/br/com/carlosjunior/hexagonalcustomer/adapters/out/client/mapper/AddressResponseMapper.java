package br.com.carlosjunior.hexagonalcustomer.adapters.out.client.mapper;

import br.com.carlosjunior.hexagonalcustomer.adapters.out.client.response.AddressResponse;
import br.com.carlosjunior.hexagonalcustomer.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);

}
