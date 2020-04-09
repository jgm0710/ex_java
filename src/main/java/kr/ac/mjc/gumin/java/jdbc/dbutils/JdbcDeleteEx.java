package kr.ac.mjc.gumin.java.jdbc.dbutils;

import java.util.List;

public class JdbcDeleteEx {

	public static void main(String[] args) {
		Board2Dao board2Dao = new Board2Dao();
		
		String id = "6";
		int updateCount = board2Dao.deleteBoard2(id);
		
		if(updateCount>0) {
			System.out.println("보드를 삭제 했습니다. id = "+id);
			System.out.println("남은 보드 출력 ");
			
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
		else {
			System.out.println("보드 삭제를 실패했습니다. \nid = "+id);
		}
	}
}
