package com.bachpan.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bachpan.demo.model.User;
@Repository
public interface UserRepository extends CrudRepository<User, Integer>{




	

}
