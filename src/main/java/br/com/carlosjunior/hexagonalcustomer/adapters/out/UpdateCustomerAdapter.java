package br.com.carlosjunior.hexagonalcustomer.adapters.out;

import br.com.carlosjunior.hexagonalcustomer.adapters.out.repository.CustomerRepository;
import br.com.carlosjunior.hexagonalcustomer.adapters.out.repository.mapper.CustomerEntityMapper;
import br.com.carlosjunior.hexagonalcustomer.application.core.domain.Customer;
import br.com.carlosjunior.hexagonalcustomer.application.ports.out.UpdateCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateCustomerAdapter implements UpdateCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void update(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
