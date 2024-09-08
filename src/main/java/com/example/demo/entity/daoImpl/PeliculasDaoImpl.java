package com.example.demo.entity.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Peliculas;
import com.example.demo.entity.dao.PeliculasDao;
import com.example.demo.entity.repository.PeliculasRepository;

@Component
public class PeliculasDaoImpl implements PeliculasDao{

	@Autowired PeliculasRepository peliculasRepository;
	
	@Override
	public Peliculas create(Peliculas a) {
		// TODO Auto-generated method stub
		return peliculasRepository.save(a);
	}

	@Override
	public Peliculas update(Peliculas a) {
		// TODO Auto-generated method stub
		return peliculasRepository.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		peliculasRepository.deleteById(id);
	}

	@Override
	public Optional<Peliculas> read(Long id) {
		// TODO Auto-generated method stub
		return peliculasRepository.findById(id);
	}

	@Override
	public List<Peliculas> readAll() {
		// TODO Auto-generated method stub
		return peliculasRepository.findAll();
	}
	

}
