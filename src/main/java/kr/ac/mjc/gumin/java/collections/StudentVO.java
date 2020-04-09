package kr.ac.mjc.gumin.java.collections;

import java.util.Objects;

public class StudentVO {

	private String name;
	private int studentId;

	public StudentVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentVO(String name, int studentId) {
		super();
		this.name = name;
		this.studentId = studentId;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final int getStudentId() {
		return studentId;
	}

	public final void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	@Override
	public String toString() {
		return "StudentVO [name=" + name + ", studentId=" + studentId + "]";
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(name, studentId);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof StudentVO) {
			StudentVO other = (StudentVO) obj;
			return this.studentId == other.getStudentId();
		}
		return false;
	}

}
