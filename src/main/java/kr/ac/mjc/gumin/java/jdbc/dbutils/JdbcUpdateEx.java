package kr.ac.mjc.gumin.java.jdbc.dbutils;

public class JdbcUpdateEx {

	public static void main(String[] args) {
		BoardDao boardDao = new BoardDao();
		
		Board board = new Board("27", "2빠", "교수님 안녕하세요.", null, "정구민", "3");
		
		int updateCount = boardDao.updateBoard(board);
		
		if(updateCount>0) {
			System.out.println("보드의 수정이 완료 되었습니다. \n"+boardDao.getBoard(board.getSeq()));
		}
		else {
			System.out.println("해당 id의 보드가 없습니다. \nid : "+board.getSeq());
		}
		
	}
}
