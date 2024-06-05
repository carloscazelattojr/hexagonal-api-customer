package br.com.carlosjunior.hexagonalcustomer.adapters.in.controller;

import br.com.carlosjunior.hexagonalcustomer.adapters.in.controller.mapper.CustomerMapper;
import br.com.carlosjunior.hexagonalcustomer.adapters.in.controller.request.CustomerRequest;
import br.com.carlosjunior.hexagonalcustomer.adapters.in.controller.response.CustomerResponse;
import br.com.carlosjunior.hexagonalcustomer.application.core.domain.Customer;
import br.com.carlosjunior.hexagonalcustomer.application.ports.in.DeleteCustomerByIdInputPort;
import br.com.carlosjunior.hexagonalcustomer.application.ports.in.FindCustomerByIdInputPort;
import br.com.carlosjunior.hexagonalcustomer.application.ports.in.InsertCustomerInputPort;
import br.com.carlosjunior.hexagonalcustomer.application.ports.in.UpdateCustomerInputPort;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {

    @Autowired
    private CustomerMapper customerMapper;

    @Autowired
    private InsertCustomerInputPort insertCustomerInputPort;

    @Autowired
    private FindCustomerByIdInputPort findCustomerByIdInputPort;

    @Autowired
    private UpdateCustomerInputPort updateCustomerInputPort;

    @Autowired
    private DeleteCustomerByIdInputPort deleteCustomerByIdInputPort;

    @PostMapping
    public ResponseEntity<Void> insert(@Valid @RequestBody CustomerRequest customerRequest) {
        var customer = customerMapper.toCustomer(customerRequest);
        insertCustomerInputPort.insert(customer, customerRequest.getZipCode());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CustomerResponse> findById(@PathVariable("id") String id) {
        var customer = findCustomerByIdInputPort.find(id);
        var customerResponse = customerMapper.toCustomerResponse(customer);
        return ResponseEntity.ok().body(customerResponse);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> update(@PathVariable("id") String id, @Valid @RequestBody CustomerRequest customerRequest) {
        Customer customer = customerMapper.toCustomer(customerRequest);
        customer.setId(id);
        updateCustomerInputPort.update(customer, customerRequest.getZipCode());
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable("id") String id) {
        deleteCustomerByIdInputPort.delete(id);
        return ResponseEntity.noContent().build();
    }
}
