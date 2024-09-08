package com.example.demo.entity.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Clientes;
import com.example.demo.entity.dao.ClientesDao;
import com.example.demo.entity.service.ClientesService;
@Service
public class ClientesServiceImpl implements ClientesService{

	@Autowired
	private ClientesDao clientesDao;
	
	@Override
	public Clientes create(Clientes c) {
		// TODO Auto-generated method stub
		return clientesDao.create(c);
	}

	@Override
	public Clientes update(Clientes c) {
		// TODO Auto-generated method stub
		return clientesDao.update(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		clientesDao.delete(id);
	}

	@Override
	public Optional<Clientes> read(Long id) {
		// TODO Auto-generated method stub
		return clientesDao.read(id);
	}

	@Override
	public List<Clientes> readAll() {
		// TODO Auto-generated method stub
		return clientesDao.readAll();
	}

}
