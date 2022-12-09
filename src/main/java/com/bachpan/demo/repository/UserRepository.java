package com.bachpan.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bachpan.demo.dto.UserDTO;
@Repository
public interface UserRepository extends CrudRepository<UserDTO, Integer>{




	

}
