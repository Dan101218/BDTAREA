package com.example.demo.entity.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.entity.Usuarios;

public interface UsuariosService {
	Usuarios create(Usuarios u);
	Usuarios update(Usuarios u);
	void delete(Long id);
	Optional<Usuarios> read(Long id);
	List<Usuarios> readAll();
}
