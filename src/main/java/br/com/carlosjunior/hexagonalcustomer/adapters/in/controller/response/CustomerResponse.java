package br.com.carlosjunior.hexagonalcustomer.adapters.in.controller.response;

import lombok.Data;

@Data
public class CustomerResponse {
    private String name;
    private AddressResponse address;
    private String cpf;
    private Boolean isValidCpf;
}
