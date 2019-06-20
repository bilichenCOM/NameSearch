package com.droptable.dao.templates;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.droptable.dao.PrivateEntepreneurDao;
import com.droptable.dao.mappers.PodatkBorzhnykRowMapper;
import com.droptable.model.PodatkBorzhnyk;
import com.droptable.utils.NamePatternBuilder;

@Repository
public class PodatkBorzhnykJdbcTemplate implements PrivateEntepreneurDao<PodatkBorzhnyk, Long> {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Optional<List<PodatkBorzhnyk>> getAll() {
		String sql = "SELECT name, sum_d, sum_m FROM reestr_podatk_borgiv"
				+ " LIMIT 100";
		List<PodatkBorzhnyk> podatkBorzhnyks = jdbcTemplate.query(sql, new PodatkBorzhnykRowMapper());
		return Optional.ofNullable(podatkBorzhnyks);
	}

	@Override
	public Optional<PodatkBorzhnyk> getById(Long id) {
		return null;
	}

	@Override
	public Optional<List<PodatkBorzhnyk>> getAllByPib(String pib) {
		String sql = "SELECT name, dpi, sum_d, sum_m "
				+ "FROM reestr_podatk_borgiv "
				+ "WHERE UPPER(name) LIKE " + NamePatternBuilder.makeLikePattern(pib)
				+ " LIMIT 100";
		List<PodatkBorzhnyk> podatkBorzhnyks = jdbcTemplate.query(sql, new PodatkBorzhnykRowMapper());
		return Optional.ofNullable(podatkBorzhnyks);
	}

}
