package kr.ac.mjc.gumin.java.jdbc.dbutils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Board {

	  private String seq;
      private String title;
      private String content;
      private String regdate;
      private String writer;
      private String cnt;
}
