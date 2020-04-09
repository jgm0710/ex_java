package kr.ac.mjc.gumin.java.jdbc.dbutils;

public class JdbcGetEx {

	public static void main(String[] args) {
		BoardDao boardDao = new BoardDao();

		String id = "6";

		Board board = boardDao.getBoard(id);

		if (board != null) {
			System.out.println(board);
		}
		else {
			System.out.println("해당 id의 보드가 없습니다. \nid : "+id);
		}
	}
}
