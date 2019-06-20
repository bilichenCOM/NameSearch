package com.droptable.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.droptable.dao.AnulPlatnykPdvDao;
import com.droptable.dao.templates.AnulPlatnykPdvJdbcTemplate;
import com.droptable.model.AnulPlatnykPdv;

@Repository
public class AnulPlatnykPdvDaoImpl implements AnulPlatnykPdvDao {

	@Autowired
	private AnulPlatnykPdvJdbcTemplate jdbcTemplate;

	@Override
	public Optional<List<AnulPlatnykPdv>> getAll() {
		return jdbcTemplate.getAll();
	}

	@Override
	public Optional<AnulPlatnykPdv> getById(Long id) {
		return jdbcTemplate.getById(id);
	}

	@Override
	public Optional<List<AnulPlatnykPdv>> getAllByPib(String pib) {
		return jdbcTemplate.getAllByPib(pib);
	}
}