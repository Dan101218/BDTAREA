package com.example.demo.entity.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Peliculas;

public interface PeliculasDao {
	Peliculas create(Peliculas p);
	Peliculas update(Peliculas p);
	void delete(Long id);
	Optional<Peliculas> read(Long id);
	List<Peliculas> readAll();
}
