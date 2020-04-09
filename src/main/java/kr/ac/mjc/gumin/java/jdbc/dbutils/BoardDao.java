package kr.ac.mjc.gumin.java.jdbc.dbutils;

import java.util.List;

import org.mariadb.jdbc.MariaDbDataSource;

public class BoardDao {
	private final String LIST_BOARDS = "select seq,title,content,regdate,writer,cnt from board";
	private final String GET_BOARD= "select seq,title,content,regdate,writer,cnt from board where seq=?";
	private final String ADD_BOARD= "insert board(title,content,writer,cnt) values(?,?,?,?)";
	private final String UPDATE_BOARD= "update board set title=?,content=?,writer=?,cnt=? where seq=?";
	private final String DELETE_BOARD= "delete from board where seq=? ";

	//DbUtils dbUtils = new DbUtils(new MariaDbDataSource("jdbc:mariadb://localhost:3306/jdbc?user=jdbc&password=javaprogramming"));
	DbUtils dbUtils = new DbUtils(new MariaDbDataSource("jdbc:mariadb://irafe.com:3306/jdbc?user=jdbc&password=javaprogramming"));
	
	
	public List<Board> getBoardList() {
		return dbUtils.list(LIST_BOARDS, (rs)->{
			Board board = new Board();
			board.setSeq(rs.getString("seq"));
			board.setTitle(rs.getString("title"));
			board.setContent(rs.getString("content"));
			board.setRegdate(rs.getString("regdate"));
			board.setWriter(rs.getString("writer"));
			board.setCnt(rs.getString("cnt"));
			
			return board;
		});
	}
	
	public Board getBoard(String id) {
		return dbUtils.get(GET_BOARD, (rs)->{
			Board board = new Board();
			board.setSeq(rs.getString("seq"));
			board.setTitle(rs.getString("title"));
			board.setContent(rs.getString("content"));
			board.setRegdate(rs.getString("regdate"));
			board.setWriter(rs.getString("writer"));
			board.setCnt(rs.getString("cnt"));
			
			return board;
		},id);
	}
	
	public int addBoard(Board board) {
		return dbUtils.update(ADD_BOARD, board.getTitle(),board.getContent(), board.getWriter(),board.getCnt());
	}
	
	public int updateBoard(Board board) {
		return dbUtils.update(UPDATE_BOARD,board.getTitle(),board.getContent(), board.getWriter(),board.getCnt(),board.getSeq());
	}
	
	public int deleteBoard(String id) {
		return dbUtils.update(DELETE_BOARD, id);
	}
	
	
}
