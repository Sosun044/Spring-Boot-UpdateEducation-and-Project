package com.sosun.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sosun.entities.Home;

@Repository
public interface IHomeRepository extends JpaRepository<Home, Long>{

}
