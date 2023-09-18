package com.luv2code.spring.cruddemo;

import com.luv2code.spring.cruddemo.dao.StudentDAO;
import com.luv2code.spring.cruddemo.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(CruddemoApplication.class, args);

	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentdao) {
		return runner -> {
			//createStudent(studentdao);
			//createMultipleStudents(studentdao);
			//readStudent(studentdao);
			//readStudent(studentdao);
			//queryForStudents(studentdao);
			//queryForStudentsByLastName(studentdao);
			//updateStudent(studentdao);
			deleteStudent(studentdao);
		};
	}

	private void deleteStudent(StudentDAO studentdao)
	{
		int studentId=3;
		System.out.println("Deleting student id"+studentId);
		studentdao.delete(studentId);
	}
	private void queryForStudentsByLastName(StudentDAO studentdao) {
     List<Student> theStudents=studentdao.findByLastName("Duck");

	 //display the list of students
		for(Student tempStudent:theStudents)
		{
			System.out.println(tempStudent);
		}

		}


	public void queryForStudents(StudentDAO studentDAO)
	{
		//get a list of students
		 List<Student > theStudents=studentDAO.findAll();

		//display list of students
		for(Student tempStudent:theStudents)
		{
			System.out.println(tempStudent);
		}
	}

public void readStudenByName(StudentDAO studentDAO)
{
	System.out.println("Reading a Student By Name");
	String name="Daffy";
	Student myStudent=studentDAO.findByName(name);


	//display student
	System.out.println("Found the Student By Name"+myStudent);
}
	public void readStudent(StudentDAO studentDAO)
	{
		//craete a student Object
		System.out.println("Creating a new Student Object");
		Student tempStudent=new Student("Daffy","Duck","daffy@luv2code.com");

		//save the student
		System.out.println("Saving the student");
		studentDAO.save(tempStudent);

		//display id of the saved student
		int id=tempStudent.getId();
		System.out.println("Saved student. Generated id"+id);

		//retrieve student based on the id:primary key
		System.out.println("Retrieving student with id:"+id);
		Student myStudent=studentDAO.findById(id);


		//display student
		System.out.println("Found the Student"+myStudent);

	}
	public void createStudent(StudentDAO studentdao)
	{
		//create the student object
		System.out.println("Creating the student object");
		Student tempStudent=new Student("Paul","Doe","paul@luv2code.com");



		//save the student object
		studentdao.save(tempStudent);

		//display id of the saved student
		System.out.println("Saved student. Generated id:"+tempStudent.getId());
	}

	public void createMultipleStudents(StudentDAO studentdao)
	{
		System.out.println("Creating 3 students");
		Student tempStudent1=new Student("John","Dao","john@luv2code.com");
		Student tempStudent2=new Student("Mary","Public","mary@luv2code.com");
		Student tempStudent3=new Student("Bonita","AppleBum","bonita@luv2code.com");

		//save the student object
		studentdao.save(tempStudent1);
		studentdao.save(tempStudent2);
		studentdao.save(tempStudent3);

		//display id of the saved student
		System.out.println("Saved Student Generated id"+tempStudent1.getId());
		System.out.println("Saved Student Generated id"+tempStudent2.getId());
		System.out.println("Saved Student Generated id"+tempStudent3.getId());


	}

	public void updateStudent(StudentDAO studentDAO)
	{
		//retrieve student based on the id:primary key
		int studentId=1;
		System.out.println("Getting Student with id:"+studentId);
		Student myStudent=studentDAO.findById(studentId);


		//change first name to "Scooby
		System.out.println("Updating student");
		myStudent.setFirstName("Scooby");

		//update the student
		studentDAO.update(myStudent);

		System.out.println("Updated student"+myStudent);


	}

}
