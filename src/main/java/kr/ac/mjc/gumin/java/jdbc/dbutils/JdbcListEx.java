package kr.ac.mjc.gumin.java.jdbc.dbutils;

import java.util.List;

public class JdbcListEx {

	public static void main(String[] args) {
		Board2Dao board2Dao = new Board2Dao();

		List<Board2> board2List = board2Dao.getBoard2List();

		if (!board2List.isEmpty()) {
			for (Board2 board2 : board2List) {
				System.out.println(board2);
			}
		}
		else {
			System.out.println("보드가 1도 없습니다.");
		}
	}
}
