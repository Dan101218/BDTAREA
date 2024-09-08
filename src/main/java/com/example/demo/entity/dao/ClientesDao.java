package com.example.demo.entity.dao;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Clientes;

public interface ClientesDao {
	Clientes create(Clientes c);
	Clientes update(Clientes c);
	void delete(Long id);
	Optional<Clientes> read(Long id);
	List<Clientes> readAll();
}
