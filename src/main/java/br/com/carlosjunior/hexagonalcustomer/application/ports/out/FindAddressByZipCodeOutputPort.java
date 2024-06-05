package br.com.carlosjunior.hexagonalcustomer.application.ports.out;

import br.com.carlosjunior.hexagonalcustomer.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);
}
