package br.com.carlosjunior.hexagonalcustomer.adapters.in.controller.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CustomerRequest {

    @NotBlank
    private String name;

    @NotBlank
    private String zipCode;

    @NotBlank
    private String cpf;

}
