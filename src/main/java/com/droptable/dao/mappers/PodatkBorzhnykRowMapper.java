package com.droptable.dao.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.droptable.model.PodatkBorzhnyk;

public class PodatkBorzhnykRowMapper implements RowMapper<PodatkBorzhnyk> {

	@Override
	public PodatkBorzhnyk mapRow(ResultSet rs, int rowNum) throws SQLException {
		PodatkBorzhnyk podatkBorzhnyk = new PodatkBorzhnyk();
		podatkBorzhnyk.setPib(rs.getString("name"));
		Double totalBorg = rs.getDouble("sum_d") + rs.getDouble("sum_m");
		podatkBorzhnyk.setBorg(totalBorg);
		podatkBorzhnyk.setDpi(rs.getString("dpi"));
		return podatkBorzhnyk;
	}
}