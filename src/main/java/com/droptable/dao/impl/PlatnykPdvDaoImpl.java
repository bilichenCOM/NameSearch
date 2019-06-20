package com.droptable.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.droptable.dao.PlatnykPdvDao;
import com.droptable.dao.templates.PlatnykPdvJdbcTemplate;
import com.droptable.model.PlatnykPdv;

@Repository
public class PlatnykPdvDaoImpl implements PlatnykPdvDao {

	@Autowired
	private PlatnykPdvJdbcTemplate platnykPdvJdbcTemplate;

	@Override
	public Optional<List<PlatnykPdv>> getAll() {
		return platnykPdvJdbcTemplate.getAll();
	}

	@Override
	public Optional<PlatnykPdv> getById(Long id) {
		return platnykPdvJdbcTemplate.getById(id);
	}

	@Override
	public Optional<List<PlatnykPdv>> getAllByPib(String pib) {
		return platnykPdvJdbcTemplate.getAllByPib(pib);
	}
}