package com.example.demo.entity.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Empleados;
import com.example.demo.entity.dao.EmpleadosDao;
import com.example.demo.entity.repository.EmpleadosRepository;

@Component
public class EmpleadosDaoImpl implements EmpleadosDao{

	@Autowired EmpleadosRepository empleadosRepository;
	
	@Override
	public Empleados create(Empleados a) {
		// TODO Auto-generated method stub
		return empleadosRepository.save(a);
	}

	@Override
	public Empleados update(Empleados a) {
		// TODO Auto-generated method stub
		return empleadosRepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		empleadosRepository.deleteById(id);
	}

	@Override
	public Optional<Empleados> read(Long id) {
		// TODO Auto-generated method stub
		return empleadosRepository.findById(id);
	}

	@Override
	public List<Empleados> readAll() {
		// TODO Auto-generated method stub
		return empleadosRepository.findAll();
	}
	

}
