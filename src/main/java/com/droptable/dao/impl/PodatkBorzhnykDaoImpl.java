package com.droptable.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.droptable.dao.PodatkBorzhnykDao;
import com.droptable.dao.templates.PodatkBorzhnykJdbcTemplate;
import com.droptable.model.PodatkBorzhnyk;

@Repository
public class PodatkBorzhnykDaoImpl implements PodatkBorzhnykDao{

	@Autowired
	private PodatkBorzhnykJdbcTemplate jdbcTemplate;

	@Override
	public Optional<List<PodatkBorzhnyk>> getAll() {
		return jdbcTemplate.getAll();
	}

	@Override
	public Optional<PodatkBorzhnyk> getById(Long id) {
		return jdbcTemplate.getById(id);
	}

	@Override
	public Optional<List<PodatkBorzhnyk>> getAllByPib(String pib) {
		return jdbcTemplate.getAllByPib(pib);
	}

}