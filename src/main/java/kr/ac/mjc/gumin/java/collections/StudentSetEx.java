package kr.ac.mjc.gumin.java.collections;

import java.util.HashSet;
import java.util.Set;

public class StudentSetEx {
	public static void main(String[] args){
		
		Set<StudentVO> student = new HashSet<StudentVO>();
		
		StudentVO st1 = new StudentVO("정구민",2015041064);
		StudentVO st2 = new StudentVO("김찬영",2016041001);
		StudentVO st3 = new StudentVO("정구민",2015041064);
		StudentVO st4 = new StudentVO("김실장",2015041064);
		StudentVO st5 = new StudentVO("정구민",2016000000);
		
		
		student.add(st1);
		student.add(st2);
		System.out.println("student.contains(st3) : "+student.contains(st3));
		student.add(st3);
		System.out.println("student.contains(st4) : "+student.contains(st4));
		student.add(st4);
		System.out.println("student.contains(st5) : "+student.contains(st5));
		student.add(st5);
		
		System.out.println("student안의 파라미터 값 : \n"+student);
		System.out.println("학번이 같으면 같은학생~");
		System.out.println("정구민(st1)과 정구민(st3)은 같은학생?  "+st1.equals(st3));
		System.out.println("정구민(st1)과 김실장(st4)은 같은학생?  "+st1.equals(st4));
		System.out.println("정구민(st1)과 정구민(st5)은 같은학생?  "+st1.equals(st5));
		System.out.println();
		
		System.out.println("st1.hashCode : "+st1.hashCode()+"\nst2.hashCode : "+st2.hashCode()+"\nst3.hashCode : "
		+st3.hashCode()+"\nst4.hashCode : "+st4.hashCode()+"\nst5.hashCode : "+st5.hashCode());
		System.out.println();
		System.out.println("st1과 st4는 학번이 같아도 이름이 다르므로 해쉬코드 값이 다르다. 때문에 student안에 add가 된다~");
		System.out.println("st1과 st5는 이름만 같고 학번과 해쉬코드 둘다 다르다. 때문에 student안에 add가 된다~\n");
		
		System.out.println("추가로 StudentVO의 toString() 구현 확인-st1 : "+st1.toString());
		
		
		
	}

}
