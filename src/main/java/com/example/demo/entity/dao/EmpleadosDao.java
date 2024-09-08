package com.example.demo.entity.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Empleados;

public interface EmpleadosDao {
	Empleados create(Empleados e);
	Empleados update(Empleados e);
	void delete(Long id);
	Optional<Empleados> read(Long id);
	List<Empleados> readAll();
}
