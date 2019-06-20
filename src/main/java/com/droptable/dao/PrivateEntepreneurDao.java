package com.droptable.dao;

import java.util.List;
import java.util.Optional;

public interface PrivateEntepreneurDao <T, ID> {

	Optional<List<T>> getAll();

	Optional<T> getById(ID id);

	Optional<List<T>> getAllByPib(String pib);
}
