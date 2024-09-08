package com.example.demo.entity.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Usuarios;
import com.example.demo.entity.dao.UsuariosDao;
import com.example.demo.entity.repository.UsuariosRepository;

@Component
public class UsuariosDaoImpl implements UsuariosDao{

	@Autowired UsuariosRepository usuariosRepository;
	
	@Override
	public Usuarios create(Usuarios c) {
		// TODO Auto-generated method stub
		return usuariosRepository.save(c);
	}

	@Override
	public Usuarios update(Usuarios c) {
		// TODO Auto-generated method stub
		return usuariosRepository.save(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		usuariosRepository.deleteById(id);
	}

	@Override
	public Optional<Usuarios> read(Long id) {
		// TODO Auto-generated method stub
		return usuariosRepository.findById(id);
	}

	@Override
	public List<Usuarios> readAll() {
		// TODO Auto-generated method stub
		return usuariosRepository.findAll();
	}
	

}
