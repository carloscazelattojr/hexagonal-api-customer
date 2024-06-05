package br.com.carlosjunior.hexagonalcustomer.adapters.out;

import br.com.carlosjunior.hexagonalcustomer.adapters.out.repository.CustomerRepository;
import br.com.carlosjunior.hexagonalcustomer.adapters.out.repository.mapper.CustomerEntityMapper;
import br.com.carlosjunior.hexagonalcustomer.application.core.domain.Customer;
import br.com.carlosjunior.hexagonalcustomer.application.ports.out.InsertCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InsertCustomerAdapter implements InsertCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void insert(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
