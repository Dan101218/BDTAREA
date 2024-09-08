package com.example.demo.entity.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Renta;
import com.example.demo.entity.dao.RentaDao;
import com.example.demo.entity.repository.RentaRepository;

@Component
public class RentaDaoImpl implements RentaDao{

	@Autowired RentaRepository rentaRepository;
	
	@Override
	public Renta create(Renta r) {
		// TODO Auto-generated method stub
		return rentaRepository.save(r);
	}

	@Override
	public Renta update(Renta r) {
		// TODO Auto-generated method stub
		return rentaRepository.save(r);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		rentaRepository.deleteById(id);
	}

	@Override
	public Optional<Renta> read(Long id) {
		// TODO Auto-generated method stub
		return rentaRepository.findById(id);
	}

	@Override
	public List<Renta> readAll() {
		// TODO Auto-generated method stub
		return rentaRepository.findAll();
	}
	

}
