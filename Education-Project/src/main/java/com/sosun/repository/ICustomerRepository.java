package com.sosun.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sosun.entities.Customer;

@Repository
public interface ICustomerRepository extends JpaRepository<Customer, Long>{

}
