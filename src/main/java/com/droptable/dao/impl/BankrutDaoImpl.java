package com.droptable.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.droptable.dao.BankrutDao;
import com.droptable.dao.templates.BankrutJdbcTemplate;
import com.droptable.model.Bankrut;

@Repository
public class BankrutDaoImpl implements BankrutDao {

	@Autowired
	private BankrutJdbcTemplate jdbcTemplate;

	@Override
	public Optional<List<Bankrut>> getAll() {
		return jdbcTemplate.getAll();
	}

	@Override
	public Optional<Bankrut> getById(Long id) {
		return jdbcTemplate.getById(id);
	}

	@Override
	public Optional<List<Bankrut>> getAllByPib(String pib) {
		return jdbcTemplate.getAllByPib(pib);
	}
}