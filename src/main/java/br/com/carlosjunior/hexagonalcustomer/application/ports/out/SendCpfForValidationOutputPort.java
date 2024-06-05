package br.com.carlosjunior.hexagonalcustomer.application.ports.out;

public interface SendCpfForValidationOutputPort {
    void send(String cpf);
}
