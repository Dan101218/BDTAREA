package com.example.demo.entity.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Generos;
import com.example.demo.entity.dao.GenerosDao;
import com.example.demo.entity.service.GenerosService;

@Service
public class GenerosServiceImpl implements GenerosService{

	@Autowired
	private GenerosDao generosDao;
	
	@Override
	public Generos create(Generos g) {
		// TODO Auto-generated method stub
		return generosDao.create(g);
	}

	@Override
	public Generos update(Generos g) {
		// TODO Auto-generated method stub
		return generosDao.update(g);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		generosDao.delete(id);
	}

	@Override
	public Optional<Generos> read(Long id) {
		// TODO Auto-generated method stub
		return generosDao.read(id);
	}

	@Override
	public List<Generos> readAll() {
		// TODO Auto-generated method stub
		return generosDao.readAll();
	}

}
