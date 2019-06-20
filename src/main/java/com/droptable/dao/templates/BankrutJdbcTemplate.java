package com.droptable.dao.templates;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.droptable.dao.PrivateEntepreneurDao;
import com.droptable.dao.mappers.BankrutRowMapper;
import com.droptable.model.Bankrut;
import com.droptable.utils.NamePatternBuilder;

@Repository
public class BankrutJdbcTemplate implements PrivateEntepreneurDao<Bankrut, Long>{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Optional<List<Bankrut>> getAll() {
		String sql = "SELECT name, proc_borg_name, date_start FROM reestr_bankrutiv_record "
				+ "LIMIT 100";
		List<Bankrut> bankruts = jdbcTemplate.query(sql, new BankrutRowMapper());
		return Optional.ofNullable(bankruts);
	}

	@Override
	public Optional<Bankrut> getById(Long id) {
		String sql = "SELECT name, proc_borg_name, date_start "
				+ "FROM reestr_bankrutiv_record "
				+ "WHERE rn_num=" + id
				+ " LIMIT 100";
		Bankrut bankrut = jdbcTemplate.queryForObject(sql, new BankrutRowMapper());
		return Optional.of(bankrut);
	}

	@Override
	public Optional<List<Bankrut>> getAllByPib(String pib) {
		String sql = "SELECT name, proc_borg_name, date_start "
				+ "FROM reestr_bankrutiv_record "
				+ "WHERE UPPER(name) LIKE " + NamePatternBuilder.makeLikePattern(pib)
				+ " LIMIT 100";
		List<Bankrut> bankruts = jdbcTemplate.query(sql, new BankrutRowMapper());
		return Optional.ofNullable(bankruts);
	}

}
