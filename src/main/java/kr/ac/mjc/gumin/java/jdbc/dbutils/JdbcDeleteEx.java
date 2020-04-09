package kr.ac.mjc.gumin.java.jdbc.dbutils;

import java.util.List;

public class JdbcDeleteEx {

	public static void main(String[] args) {
		BoardDao boardDao = new BoardDao();
		
		
		String id = "27";
		int updateCount = boardDao.deleteBoard(id);
		
		if(updateCount>0) {
			System.out.println("보드를 삭제 했습니다. id = "+id);
			System.out.println("남은 보드 출력 ");
			
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
		else {
			System.out.println("보드 삭제를 실패했습니다. \nid = "+id);
		}
	}
}
