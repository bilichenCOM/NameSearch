package com.droptable.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.droptable.dao.AnulPlatnykPdvDao;
import com.droptable.model.AnulPlatnykPdv;
import com.droptable.service.AnulPlatnykPdvService;

@Service
public class AnulPlatnykPdvServiceImpl implements AnulPlatnykPdvService {

	@Autowired
	private AnulPlatnykPdvDao anulPlatnykPdvDao;

	@Override
	public List<AnulPlatnykPdv> getAll() {
		return anulPlatnykPdvDao.getAll().orElseGet(() -> new ArrayList<>());
	}

	@Override
	public List<AnulPlatnykPdv> getAllByPib(String pib) {
		return anulPlatnykPdvDao.getAllByPib(pib).orElseGet(() -> new ArrayList<>());
	}

	@Override
	public AnulPlatnykPdv getById(Long id) {
		return anulPlatnykPdvDao.getById(id).get();
	}

	@Override
	public void add(AnulPlatnykPdv t) {
	}

	@Override
	public void udpdate(AnulPlatnykPdv t) {
	}

	@Override
	public void delete(Long id) {
	}
}