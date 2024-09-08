package com.example.demo.entity.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Peliculas;
import com.example.demo.entity.dao.PeliculasDao;
import com.example.demo.entity.service.PeliculasService;

@Service
public class PeliculasServiceImpl implements PeliculasService{

	@Autowired
	private PeliculasDao peliculasDao;
	
	@Override
	public Peliculas create(Peliculas p) {
		// TODO Auto-generated method stub
		return peliculasDao.create(p);
	}

	@Override
	public Peliculas update(Peliculas p) {
		// TODO Auto-generated method stub
		return peliculasDao.update(p);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		peliculasDao.delete(id);
	}

	@Override
	public Optional<Peliculas> read(Long id) {
		// TODO Auto-generated method stub
		return peliculasDao.read(id);
	}

	@Override
	public List<Peliculas> readAll() {
		// TODO Auto-generated method stub
		return peliculasDao.readAll();
	}

}
