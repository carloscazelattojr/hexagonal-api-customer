package br.com.carlosjunior.hexagonalcustomer.application.ports.in;

import br.com.carlosjunior.hexagonalcustomer.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);
}
