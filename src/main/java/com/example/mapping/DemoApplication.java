package com.example.mapping;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.mapping.entities.Category;
import com.example.mapping.entities.Course;
import com.example.mapping.entities.Laptop;
import com.example.mapping.entities.Product;
import com.example.mapping.entities.Student;
import com.example.mapping.repository.CategoryRepository;
import com.example.mapping.repository.ProductRepository;
import com.example.mapping.repository.StudentRepository;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner{
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ProductRepository productRepository;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception{
		
		
		//ONE TO ONE MAPPING
		
		/*Student student = new Student();
		student.setStudentName("Yash Parmar");
		student.setStudentAbout("I am Bussiness Executive at TCS");
		
		
		Laptop laptop = new Laptop();
		laptop.setModelName("Expertbook");
		laptop.setBrand("ASUS");
		laptop.setLaptopId(434);
	    
		//mandatory
		laptop.setStudent(student); 
		
		//not madatory but need to add
		student.setLaptop(laptop);
		
		Student save =  studentRepository.save(student);
		
		int id = 3;
		Student student1 = studentRepository.findById(id).get();
		System.out.println(student1.getStudentName());
		
		Laptop laptop1 = student1.getLaptop();
		System.out.println("laptop brand"+laptop1.getBrand()+ "and laptop model name" +laptop1.getModelName());
		
		System.out.println("Name of student is :" + save.getStudentName());
		
*/		
		
		
		//ONE TO MANY MAPPING
		
		/*Student student = new Student();
		student.setStudentName("Rishabh Kundal");
		student.setStudentAbout("I work for TCS");
		
		Course course1 = new Course();
		course1.setCourseId(75);
		course1.setCourseName("IOT");
		course1.setCourseDescription("This is course for IOT");
		course1.setStudent(student);
		
		Course course2 = new Course();
		course2.setCourseId(15);
		course2.setCourseName("Kubernetes");
		course2.setCourseDescription("This is course for Kubernetes");
		course2.setStudent(student);
		
		List<Course> courseList = new ArrayList<>();
		courseList.add(course1);
		courseList.add(course2);
		
		student.setCourseList(courseList);
		
		Student stu = studentRepository.save(student);
		
		//System.out.println("student name : "+ stu.getStudentName() +" is enrolled in "+
		 //stu.getCourseList().toString()+" courses");
		*/
		
		
		//MANY TO MANY
		
		Product prod1 = new Product();
		prod1.setProductId(23);
		prod1.setProductName("I Phone 14");
		prod1.setProductPrice(120000);
		
		Product prod2 = new Product();
		prod2.setProductId(48);
		prod2.setProductName("Samsung Galaxy Pro");
		prod2.setProductPrice(86555);

		Product prod3 = new Product();
		prod3.setProductId(258);
		prod3.setProductName("LG SmartTV 43inch");
		prod3.setProductPrice(45000);
		
		
		Category cat1 = new Category();
		cat1.setCategoryId(74);
		cat1.setCategoryName("Electronics");
		
		Category cat2 = new Category();
		cat2.setCategoryId(96);
		cat2.setCategoryName("Mobile Phones");

		List<Product> cat1Product = cat1.getProductList();
		cat1Product.add(prod1);
		cat1Product.add(prod2);
		cat1Product.add(prod3);
		
		List<Product> cat2Product = cat2.getProductList();
		cat2Product.add(prod1);
		cat2Product.add(prod2);
		
		categoryRepository.save(cat1);
		categoryRepository.save(cat2);
		
	}

}
