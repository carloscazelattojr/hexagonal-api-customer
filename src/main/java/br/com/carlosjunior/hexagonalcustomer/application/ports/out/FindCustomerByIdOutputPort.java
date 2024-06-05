package br.com.carlosjunior.hexagonalcustomer.application.ports.out;

import br.com.carlosjunior.hexagonalcustomer.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutputPort {

    Optional<Customer> find(String id);
}
