package com.example.demo.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Clientes;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Long> {

}
