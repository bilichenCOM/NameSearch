package com.droptable.dao.templates;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.droptable.dao.PrivateEntepreneurDao;
import com.droptable.dao.mappers.PlatnykPdvRowMapper;
import com.droptable.model.PlatnykPdv;
import com.droptable.utils.NamePatternBuilder;

@Repository
public class PlatnykPdvJdbcTemplate implements PrivateEntepreneurDao<PlatnykPdv, Long> {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public Optional<List<PlatnykPdv>> getAll() {
		String sql = "SELECT name, kod_pdv FROM reestr_platnikiv_pdv LIMIT 100";
		List<PlatnykPdv> platnykPdvs = jdbcTemplate.query(sql, new PlatnykPdvRowMapper());
		return Optional.ofNullable(platnykPdvs);
	}

	public Optional<PlatnykPdv> getById(Long id) {
		String sql = "SELECT name, kod_pdv "
				+ "FROM reestr_platnikiv_pdv WHERE kod_pdv=" + id
				+ " LIMIT 100";
		PlatnykPdv platnykPdv = jdbcTemplate.queryForObject(sql, new PlatnykPdvRowMapper());
		return Optional.ofNullable(platnykPdv);
	}

	public Optional<List<PlatnykPdv>> getAllByPib(String pib) {
		String sql = "SELECT name, kod_pdv "
				+ "FROM reestr_platnikiv_pdv "
				+ "WHERE UPPER(name) LIKE " + NamePatternBuilder.makeLikePattern(pib)
				+ " LIMIT 100";
		List<PlatnykPdv> platnykPdvs = jdbcTemplate.<PlatnykPdv>query(sql, new PlatnykPdvRowMapper());
		return Optional.ofNullable(platnykPdvs);
	}
}