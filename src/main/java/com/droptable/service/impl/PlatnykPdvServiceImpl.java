package com.droptable.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.droptable.dao.PlatnykPdvDao;
import com.droptable.model.PlatnykPdv;
import com.droptable.service.PlatnykPdvService;

@Service
public class PlatnykPdvServiceImpl implements PlatnykPdvService {

	@Autowired()
	private PlatnykPdvDao platnykPdvDao;

	@Override
	public List<PlatnykPdv> getAll() {
		return platnykPdvDao.getAll().orElseGet(() -> new ArrayList<>());
	}

	@Override
	public List<PlatnykPdv> getAllByPib(String pib) {
		return platnykPdvDao.getAllByPib(pib).orElseGet(() -> new ArrayList<>());
	}

	@Override
	public PlatnykPdv getById(Long id) {
		return platnykPdvDao.getById(id).orElseGet(() -> new PlatnykPdv());
	}

	@Override
	public void add(PlatnykPdv t) {
	}

	@Override
	public void udpdate(PlatnykPdv t) {
	}

	@Override
	public void delete(Long id) {
	}
}
