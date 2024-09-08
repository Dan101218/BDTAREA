package com.example.demo.entity.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Generos;
import com.example.demo.entity.dao.GenerosDao;
import com.example.demo.entity.repository.GenerosRepository;

@Component
public class GenerosDaoImpl implements GenerosDao{

	@Autowired GenerosRepository generosRepository;
	
	@Override
	public Generos create(Generos g) {
		// TODO Auto-generated method stub
		return generosRepository.save(g);
	}

	@Override
	public Generos update(Generos g) {
		// TODO Auto-generated method stub
		return generosRepository.save(g);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		generosRepository.deleteById(id);
	}

	@Override
	public Optional<Generos> read(Long id) {
		// TODO Auto-generated method stub
		return generosRepository.findById(id);
	}

	@Override
	public List<Generos> readAll() {
		// TODO Auto-generated method stub
		return generosRepository.findAll();
	}
	

}
