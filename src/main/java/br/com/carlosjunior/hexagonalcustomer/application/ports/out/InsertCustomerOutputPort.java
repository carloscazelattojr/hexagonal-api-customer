package br.com.carlosjunior.hexagonalcustomer.application.ports.out;

import br.com.carlosjunior.hexagonalcustomer.application.core.domain.Customer;

public interface InsertCustomerOutputPort {
    void insert(Customer customer);
}
