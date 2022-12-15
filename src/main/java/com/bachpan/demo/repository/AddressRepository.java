package com.bachpan.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bachpan.demo.model.Address;
@Repository
public interface AddressRepository extends CrudRepository<Address, Integer>{


}
