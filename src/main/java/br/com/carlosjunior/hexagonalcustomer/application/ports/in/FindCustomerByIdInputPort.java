package br.com.carlosjunior.hexagonalcustomer.application.ports.in;

import br.com.carlosjunior.hexagonalcustomer.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {
    Customer find(String id);
}
