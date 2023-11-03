package com.example.mapping.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="jpa_students")
public class Student {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int studentId;
	
	private String studentName;
	private String studentAbout;
	
	@OneToOne(mappedBy="student",cascade=CascadeType.ALL)
	private Laptop laptop;
	
	@OneToMany(mappedBy="student",cascade=CascadeType.ALL)
	private List<Course> courseList = new ArrayList<>();

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public List<Course> getCourseList() {
		return courseList;
	}

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentAbout() {
		return studentAbout;
	}

	public void setStudentAbout(String studentAbout) {
		this.studentAbout = studentAbout;
	}

	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public Student(int studentId, String studentName, String studentAbout, Laptop laptop) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAbout = studentAbout;
		this.laptop = laptop;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAbout=" + studentAbout
				+ ", laptop=" + laptop + "]";
	}
	
	

}
