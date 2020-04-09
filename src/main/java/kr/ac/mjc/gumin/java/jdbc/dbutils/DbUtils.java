package kr.ac.mjc.gumin.java.jdbc.dbutils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;


public class DbUtils {		//dao 클래스에서 커넥션을 가져오는 부분을 묶어서 처리
	DataSource ds = null;
	
	public DbUtils(DataSource ds) {	//생성시 DataSource 객체를 받아옴
		this.ds = ds;
	}
	
	public <T> List<T> list(String sql, RowMapper<T> rowMapper,
			Object... params) throws DataAccessException{	//테이블의 전체 리스트를 뽑아주는 메서드
		
		try(Connection con = ds.getConnection();
				PreparedStatement ps = con.prepareStatement(sql)){
			setParams(ps, params);
			ResultSet rs = ps.executeQuery();
			List<T> list = new ArrayList<>();
			
			while(rs.next()) {
				T t = rowMapper.mapRow(rs);
				list.add(t);
			}
			return list;
		}catch(SQLException e) {
			e.printStackTrace();
			throw new DataAccessException(e);
		}
	}
	
	public <T> T get(String sql, RowMapper<T> rowMapper, Object... params) throws DataAccessException{
		//1개 조회
		
		try(Connection con = ds.getConnection();
				PreparedStatement ps = con.prepareStatement(sql)){
			setParams(ps, params);		//id 값을 쿼리문에 넣어줌
			ResultSet rs = ps.executeQuery();
			T t = null;
			if(rs.next()) {
				t=rowMapper.mapRow(rs);
			}
			return t;
			
		}catch(SQLException e) {
			e.printStackTrace();
			throw new DataAccessException(e);
		}
	}
	
	public int update(String sql, Object...params) throws DataAccessException{
		//1개의 데이터를 업데이트  수정,삭제,추가
		try(Connection con=ds.getConnection();
				PreparedStatement ps = con.prepareStatement(sql)){
			setParams(ps, params);
			return ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
			throw new DataAccessException(e);
		}
	}
	
	
	
	
	public void setParams(PreparedStatement ps, Object... params)
	throws SQLException{	//쿼리문에 파라미터를 넣어주기 위한 메서드
		if(params != null) {
			for(int i=0; i<params.length; i++)
				ps.setObject(i+1, params[i]);
		}
	}
	

}
