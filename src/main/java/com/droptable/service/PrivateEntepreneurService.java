package com.droptable.service;

import java.util.List;

public interface PrivateEntepreneurService<T, ID> {

	List<T> getAll();

	List<T> getAllByPib(String pib);

	T getById(ID id);

	void add(T t);

	void udpdate(T t);

	void delete(ID id);
}
