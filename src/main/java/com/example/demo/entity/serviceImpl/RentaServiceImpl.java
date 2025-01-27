package com.example.demo.entity.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Renta;
import com.example.demo.entity.dao.RentaDao;
import com.example.demo.entity.service.RentaService;

@Service
public class RentaServiceImpl implements RentaService{

	@Autowired
	private RentaDao rentaDao;
	
	@Override
	public Renta create(Renta r) {
		// TODO Auto-generated method stub
		return rentaDao.create(r);
	}

	@Override
	public Renta update(Renta r) {
		// TODO Auto-generated method stub
		return rentaDao.update(r);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		rentaDao.delete(id);
	}

	@Override
	public Optional<Renta> read(Long id) {
		// TODO Auto-generated method stub
		return rentaDao.read(id);
	}

	@Override
	public List<Renta> readAll() {
		// TODO Auto-generated method stub
		return rentaDao.readAll();
	}

}
