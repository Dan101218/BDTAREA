package com.example.demo.entity.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Renta;

public interface RentaDao {
	Renta create(Renta r);
	Renta update(Renta r);
	void delete(Long id);
	Optional<Renta> read(Long id);
	List<Renta> readAll();
}
