package kr.ac.mjc.gumin.java.jdbc.dbutils;

public class JdbcUpdateEx {

	public static void main(String[] args) {
		Board2Dao board2Dao = new Board2Dao();
		
		Board2 board2 = new Board2("6","이현승","컴퓨터전자과");
		
		int updateCount = board2Dao.updateBoard2(board2);
		
		if(updateCount>0) {
			System.out.println("보드의 수정이 완료 되었습니다. \n"+board2Dao.getBoard2(board2.getId()));
		}
		else {
			System.out.println("해당 id의 보드가 없습니다. \nid : "+board2.getId());
		}
		
	}
}
