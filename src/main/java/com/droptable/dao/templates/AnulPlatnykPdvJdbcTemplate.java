package com.droptable.dao.templates;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.droptable.dao.PrivateEntepreneurDao;
import com.droptable.dao.mappers.AnulPlatnykPdvRowMapper;
import com.droptable.model.AnulPlatnykPdv;
import com.droptable.utils.NamePatternBuilder;

@Repository
public class AnulPlatnykPdvJdbcTemplate implements PrivateEntepreneurDao<AnulPlatnykPdv, Long> {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Optional<List<AnulPlatnykPdv>> getAll() {
		String sql = "SELECT name, kod_pdv, name_anul FROM pdv_anul_entities LIMIT 100";
		List<AnulPlatnykPdv> anulPlatnykPdvs = jdbcTemplate.query(sql, new AnulPlatnykPdvRowMapper());
		return Optional.ofNullable(anulPlatnykPdvs);
	}

	@Override
	public Optional<AnulPlatnykPdv> getById(Long id) {
		String sql = "SELECT name, kod_pdv, name_anul FROM pdv_anul_entities WHERE kod_pdv=" + id
				+ "LIMIT 100";
		AnulPlatnykPdv anulPlatnykPdv = jdbcTemplate.queryForObject(sql, new AnulPlatnykPdvRowMapper());
		return Optional.ofNullable(anulPlatnykPdv);
	}

	@Override
	public Optional<List<AnulPlatnykPdv>> getAllByPib(String pib) {
		String sql = "SELECT name, kod_pdv, name_anul "
				+ "FROM pdv_anul_entities "
				+ "WHERE UPPER(name) LIKE " + NamePatternBuilder.makeLikePattern(pib)
				+ " LIMIT 100";
		List<AnulPlatnykPdv> anulPlatnykPdvs = jdbcTemplate.query(sql, new AnulPlatnykPdvRowMapper());
		return Optional.ofNullable(anulPlatnykPdvs);
	}

}
