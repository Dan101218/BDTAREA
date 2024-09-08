package com.example.demo.entity.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Acceso;
import com.example.demo.entity.dao.AccesoDao;
import com.example.demo.entity.repository.AccesoRepository;

@Component
public class AccesoDaoImpl implements AccesoDao{

	@Autowired AccesoRepository accesoRepository;
	
	@Override
	public Acceso create(Acceso a) {
		// TODO Auto-generated method stub
		return accesoRepository.save(a);
	}

	@Override
	public Acceso update(Acceso a) {
		// TODO Auto-generated method stub
		return accesoRepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		accesoRepository.deleteById(id);
	}

	@Override
	public Optional<Acceso> read(Long id) {
		// TODO Auto-generated method stub
		return accesoRepository.findById(id);
	}

	@Override
	public List<Acceso> readAll() {
		// TODO Auto-generated method stub
		return accesoRepository.findAll();
	}
	

}