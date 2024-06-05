package br.com.carlosjunior.hexagonalcustomer.application.core.usecase;

import br.com.carlosjunior.hexagonalcustomer.application.core.domain.Customer;
import br.com.carlosjunior.hexagonalcustomer.application.ports.in.InsertCustomerInputPort;
import br.com.carlosjunior.hexagonalcustomer.application.ports.out.FindAddressByZipCodeOutputPort;
import br.com.carlosjunior.hexagonalcustomer.application.ports.out.InsertCustomerOutputPort;
import br.com.carlosjunior.hexagonalcustomer.application.ports.out.SendCpfForValidationOutputPort;

public class InsertCustomerUseCase implements InsertCustomerInputPort {

    private final FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort;
    private final InsertCustomerOutputPort insertCustomerOutputPort;
    private final SendCpfForValidationOutputPort sendCpfForValidationOutputPort;

    public InsertCustomerUseCase(FindAddressByZipCodeOutputPort findAddressByZipCodeOutputPort,
                                 InsertCustomerOutputPort insertCustomerOutputPort,
                                 SendCpfForValidationOutputPort sendCpfForValidationOutputPort) {
        this.findAddressByZipCodeOutputPort = findAddressByZipCodeOutputPort;
        this.insertCustomerOutputPort = insertCustomerOutputPort;
        this.sendCpfForValidationOutputPort = sendCpfForValidationOutputPort;
    }

    @Override
    public void insert(Customer customer, String zipCode) {
        var address = findAddressByZipCodeOutputPort.find(zipCode);
        customer.setAddress(address);
        insertCustomerOutputPort.insert(customer);
        sendCpfForValidationOutputPort.send(customer.getCpf());
    }
}
