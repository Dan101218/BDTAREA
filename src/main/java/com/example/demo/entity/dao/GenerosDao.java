package com.example.demo.entity.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Generos;

public interface GenerosDao {

	Generos create(Generos g);
	Generos update(Generos g);
	void delete(Long id);
	Optional<Generos> read(Long id);
	List<Generos> readAll();
	
}
