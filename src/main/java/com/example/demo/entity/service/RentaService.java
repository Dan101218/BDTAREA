package com.example.demo.entity.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Renta;

public interface RentaService {
	Renta create(Renta r);
	Renta update(Renta r);
	void delete(Long id);
	Optional<Renta> read(Long id);
	List<Renta> readAll();
}
