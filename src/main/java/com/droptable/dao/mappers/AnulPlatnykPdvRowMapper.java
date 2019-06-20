package com.droptable.dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.droptable.model.AnulPlatnykPdv;

public class AnulPlatnykPdvRowMapper implements RowMapper<AnulPlatnykPdv> {

	@Override
	public AnulPlatnykPdv mapRow(ResultSet rs, int rowNum) throws SQLException {
		AnulPlatnykPdv anulPlatnykPdv = new AnulPlatnykPdv();
		anulPlatnykPdv.setPib(rs.getString("name"));
		anulPlatnykPdv.setKodPdv(rs.getLong("kod_pdv"));
		anulPlatnykPdv.setNameAnul(rs.getString("name_anul"));
		return anulPlatnykPdv;
	}
}