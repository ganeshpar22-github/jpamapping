package com.example.mapping.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="jpa_laptops")
public class Laptop {
	
	@Id
	private int laptopId;
	
	private String modelName;
	private String brand;
	
	@OneToOne
	@JoinColumn(name="student_id")
	private Student student;

	public int getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Laptop(int laptopId, String modelName, String brand, Student student) {
		super();
		this.laptopId = laptopId;
		this.modelName = modelName;
		this.brand = brand;
		this.student = student;
	}

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Laptop [laptopId=" + laptopId + ", modelName=" + modelName + ", brand=" + brand + ", student=" + student
				+ "]";
	}
	
	

}
