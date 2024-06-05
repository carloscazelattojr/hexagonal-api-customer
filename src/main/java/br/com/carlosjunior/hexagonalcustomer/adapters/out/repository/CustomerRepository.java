package br.com.carlosjunior.hexagonalcustomer.adapters.out.repository;

import br.com.carlosjunior.hexagonalcustomer.adapters.out.repository.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {

}
