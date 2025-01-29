package com.sosun.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sosun.entities.Address;

@Repository
public interface IAdressRepository extends JpaRepository<Address, Long>{

}
