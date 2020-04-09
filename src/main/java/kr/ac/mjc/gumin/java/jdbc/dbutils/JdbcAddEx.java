package kr.ac.mjc.gumin.java.jdbc.dbutils;

public class JdbcAddEx {
	public static void main(String[] args) {
		BoardDao boardDao = new BoardDao();
		Board board = new Board(null, "이번 과제 쉽지 않네?", "여러모로 많이 배우고 있습니다~", null, "정구민", "1");	
		int updateCount = boardDao.addBoard(board);
		
		if(updateCount>0) {
			System.out.println("보드를 추가했습니다. \n"+board);
		}
		else {
			System.out.println("보드를 추가를 실패했습니다. "+board);
		}
	}

}
