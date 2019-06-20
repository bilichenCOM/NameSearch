package com.droptable.dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.droptable.model.Bankrut;

public class BankrutRowMapper implements RowMapper<Bankrut> {

	@Override
	public Bankrut mapRow(ResultSet rs, int rowNum) throws SQLException {
		Bankrut bankrut = new Bankrut();
		bankrut.setPib(rs.getString("name"));
		bankrut.setProcBorgName(rs.getString("proc_borg_name"));
		bankrut.setDateStart(rs.getString("date_start"));
		return bankrut;
	}
}