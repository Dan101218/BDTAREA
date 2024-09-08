package com.example.demo.entity.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Usuarios;
import com.example.demo.entity.dao.UsuariosDao;
import com.example.demo.entity.service.UsuariosService;

@Service
public class UsuariosServiceImpl implements UsuariosService{

	@Autowired
	private UsuariosDao usuariosDao;
	
	@Override
	public Usuarios create(Usuarios u) {
		// TODO Auto-generated method stub
		return usuariosDao.create(u);
	}

	@Override
	public Usuarios update(Usuarios u) {
		// TODO Auto-generated method stub
		return usuariosDao.update(u);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		usuariosDao.delete(id);
	}

	@Override
	public Optional<Usuarios> read(Long id) {
		// TODO Auto-generated method stub
		return usuariosDao.read(id);
	}

	@Override
	public List<Usuarios> readAll() {
		// TODO Auto-generated method stub
		return usuariosDao.readAll();
	}

}
