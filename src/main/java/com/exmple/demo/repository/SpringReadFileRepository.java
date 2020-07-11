package com.exmple.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.exmple.demo.model.User;

@Repository
public interface SpringReadFileRepository extends CrudRepository<User, Long>{

}
