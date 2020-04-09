package kr.ac.mjc.gumin.java.jdbc.dbutils;

import java.util.List;

import org.mariadb.jdbc.MariaDbDataSource;

public class Board2Dao {
	private final String LIST_BOARD2S = "select * from board";
	private final String GET_BOARD2S= "select id,name,dept from board where id=?";
	private final String ADD_BOARD2S= "insert board(name,dept) values(?,?)";
	private final String UPDATE_BOARD2S= "update board set name=?, dept=? where id=?";
	private final String DELETE_BOARD2S= "delete from board where id=? ";

	//DbUtils dbUtils = new DbUtils(new MariaDbDataSource("jdbc:mariadb://localhost:3306/jdbc?user=jdbc&password=javaprogramming"));
	DbUtils dbUtils = new DbUtils(new MariaDbDataSource(" jdbc:mariadb://irafe.com:3306/jdbc?user=jdbc&password=javaprogramming"));
	
	
	public List<Board2> getBoard2List() {
		return dbUtils.list(LIST_BOARD2S, (rs)->{
			Board2 board2 = new Board2();
			board2.setId(rs.getString("id"));
			board2.setName(rs.getString("name"));
			board2.setDept(rs.getString("dept"));
			
			return board2;
		});
	}
	
	public Board2 getBoard2(String id) {
		return dbUtils.get(GET_BOARD2S, (rs)->{
			Board2 board2 = new Board2();
			board2.setId(rs.getString("id"));
			board2.setName(rs.getString("name"));
			board2.setDept(rs.getString("dept"));
			
			return board2;
		},id);
	}
	
	public int addBoard2(Board2 board2) {
		return dbUtils.update(ADD_BOARD2S, board2.getName(), board2.getDept());
	}
	
	public int updateBoard2(Board2 board2) {
		return dbUtils.update(UPDATE_BOARD2S,  board2.getName(), board2.getDept(), board2.getId());
	}
	
	public int deleteBoard2(String id) {
		return dbUtils.update(DELETE_BOARD2S, id);
	}
	
	
}
