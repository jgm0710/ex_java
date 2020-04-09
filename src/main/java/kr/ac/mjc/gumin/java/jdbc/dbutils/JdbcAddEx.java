package kr.ac.mjc.gumin.java.jdbc.dbutils;

public class JdbcAddEx {
	public static void main(String[] args) {
		Board2Dao board2Dao = new Board2Dao();
		Board2 board2 = new Board2(null, "정구민", "전자공학과");
		
		int updateCount = board2Dao.addBoard2(board2);
		
		if(updateCount>0) {
			System.out.println("보드를 추가했습니다. \n"+board2);
		}
		else {
			System.out.println("보드를 추가를 실패했습니다. "+board2);
		}
	}

}
