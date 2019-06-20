package com.droptable.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.droptable.dao.BankrutDao;
import com.droptable.model.Bankrut;
import com.droptable.service.BankrutService;

@Service
public class BankrutServiceImpl implements BankrutService {

	@Autowired
	private BankrutDao bankrutDao;

	@Override
	public List<Bankrut> getAll() {
		return bankrutDao.getAll().orElseGet(() -> new ArrayList<>());
	}

	@Override
	public List<Bankrut> getAllByPib(String pib) {
		return bankrutDao.getAllByPib(pib).orElseGet(() -> new ArrayList<>());
	}

	@Override
	public Bankrut getById(Long id) {
		return bankrutDao.getById(id).get();
	}

	@Override
	public void add(Bankrut t) {
	}

	@Override
	public void udpdate(Bankrut t) {
	}

	@Override
	public void delete(Long id) {
	}

}
