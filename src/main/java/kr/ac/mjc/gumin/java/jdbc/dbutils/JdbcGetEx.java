package kr.ac.mjc.gumin.java.jdbc.dbutils;

public class JdbcGetEx {

	public static void main(String[] args) {
		Board2Dao board2Dao = new Board2Dao();

		String id = "6";

		Board2 board2 = board2Dao.getBoard2(id);

		if (board2 != null) {
			System.out.println(board2);
		}
		else {
			System.out.println("해당 id의 보드가 없습니다. \nid : "+id);
		}
	}
}
