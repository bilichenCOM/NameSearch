package com.droptable.dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.droptable.model.PlatnykPdv;

public class PlatnykPdvRowMapper implements RowMapper<PlatnykPdv> {

	@Override
	public PlatnykPdv mapRow(ResultSet rs, int rowNum) throws SQLException {
//		if(rs.next()) {
			PlatnykPdv platnykPdv = new PlatnykPdv();
			platnykPdv.setPib(rs.getString("name"));
			platnykPdv.setKodPdv(rs.getLong("kod_pdv"));
			return platnykPdv;
//		} else {
//			return null;
//		}
	}
}
