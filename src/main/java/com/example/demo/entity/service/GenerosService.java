package com.example.demo.entity.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Generos;

public interface GenerosService {
	Generos create(Generos g);
	Generos update(Generos g);
	void delete(Long id);
	Optional<Generos> read(Long id);
	List<Generos> readAll();
}
