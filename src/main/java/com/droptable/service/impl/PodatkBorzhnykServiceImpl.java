package com.droptable.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.droptable.dao.PodatkBorzhnykDao;
import com.droptable.model.PodatkBorzhnyk;
import com.droptable.service.PodatkBorzhnykService;

@Service
public class PodatkBorzhnykServiceImpl implements PodatkBorzhnykService {

	@Autowired
	private PodatkBorzhnykDao podatkBorzhnykDao;

	@Override
	public List<PodatkBorzhnyk> getAll() {
		return podatkBorzhnykDao.getAll().orElseGet(() -> new ArrayList<>());
	}

	@Override
	public List<PodatkBorzhnyk> getAllByPib(String pib) {
		return podatkBorzhnykDao.getAllByPib(pib).orElseGet(() -> new ArrayList<>());
	}

	@Override
	public PodatkBorzhnyk getById(Long id) {
		return podatkBorzhnykDao.getById(id).get();
	}

	@Override
	public void add(PodatkBorzhnyk t) {
	}

	@Override
	public void udpdate(PodatkBorzhnyk t) {
	}

	@Override
	public void delete(Long id) {
	}

}
