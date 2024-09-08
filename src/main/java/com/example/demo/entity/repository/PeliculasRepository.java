package com.example.demo.entity.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Peliculas;

@Repository
public interface PeliculasRepository extends JpaRepository<Peliculas, Long> {

}
