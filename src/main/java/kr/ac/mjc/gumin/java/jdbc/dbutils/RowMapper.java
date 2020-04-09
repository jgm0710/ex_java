package kr.ac.mjc.gumin.java.jdbc.dbutils;

import java.sql.ResultSet;
import java.sql.SQLException;

@FunctionalInterface
public interface RowMapper<T> {

	public T mapRow(ResultSet rs) throws SQLException; 
}
