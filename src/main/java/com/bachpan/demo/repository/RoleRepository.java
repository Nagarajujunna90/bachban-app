package com.bachpan.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.bachpan.demo.model.Role;

public interface RoleRepository  extends CrudRepository<Role, Integer>{

}
