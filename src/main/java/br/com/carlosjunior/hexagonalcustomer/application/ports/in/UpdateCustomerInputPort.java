package br.com.carlosjunior.hexagonalcustomer.application.ports.in;

import br.com.carlosjunior.hexagonalcustomer.application.core.domain.Customer;

public interface UpdateCustomerInputPort {
    void update(Customer customer, String zipCode);
}
