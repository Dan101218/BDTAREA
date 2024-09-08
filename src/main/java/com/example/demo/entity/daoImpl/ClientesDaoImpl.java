package com.example.demo.entity.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Clientes;
import com.example.demo.entity.dao.ClientesDao;
import com.example.demo.entity.repository.ClientesRepository;

@Component
public class ClientesDaoImpl implements ClientesDao{

	@Autowired ClientesRepository clientesRepository;
	
	@Override
	public Clientes create(Clientes c) {
		// TODO Auto-generated method stub
		return clientesRepository.save(c);
	}

	@Override
	public Clientes update(Clientes c) {
		// TODO Auto-generated method stub
		return clientesRepository.save(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		clientesRepository.deleteById(id);
	}

	@Override
	public Optional<Clientes> read(Long id) {
		// TODO Auto-generated method stub
		return clientesRepository.findById(id);
	}

	@Override
	public List<Clientes> readAll() {
		// TODO Auto-generated method stub
		return clientesRepository.findAll();
	}
	

}
