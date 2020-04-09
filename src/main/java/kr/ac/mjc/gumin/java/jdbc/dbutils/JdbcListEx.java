package kr.ac.mjc.gumin.java.jdbc.dbutils;

import java.util.List;

public class JdbcListEx {

	public static void main(String[] args) {
		BoardDao boardDao = new BoardDao();

		List<Board> boardList = boardDao.getBoardList();

		if (!boardList.isEmpty()) {
			for (Board board : boardList) {
				System.out.println(board);
			}
		}
		else {
			System.out.println("보드가 1도 없습니다.");
		}
	}
}
