package in.co.vwits.sms.dao.impl;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

import in.co.vwits.sms.model.Student;

//To help our application to(Read, Insert, Update, Delete) talk to underline data store(in memory/databases).
public class StudentDaoImpl {

	private List<Student> students;


	public StudentDaoImpl() {
		students = new ArrayList<Student>();
		Student s1 = new Student();
		s1.setRollno(1);
		s1.setName("Amit");
		s1.setPercentage(81);
		s1.setNumberOfAttempts(5);

		Student s2 = new Student();
		s2.setRollno(2);
		s2.setName("Sumit");
		s2.setPercentage(75);
		s2.setNumberOfAttempts(2);
		
		Student s3 = new Student();
		s3.setRollno(3);
		s3.setName("Ragul");
		s3.setPercentage(85);
		s3.setNumberOfAttempts(3);

		students.add(s1);
		students.add(s2);
		students.add(s3);
	}
	//Read All
	public List<Student> findAll(){
		return students;
	}
	//Create
	public void save(Student s) {
		students.add(s);
	}
	// Find
	public Student findByRollNo(int rollno) {
		for(Student s : students) {
			if(s.getRollno() == rollno) {
				return s;
			}
		}
		return null;
	}
	// delete
	public void deleteStudent(int rollno) {
		Iterator<Student> i = students.iterator();
		while(i.hasNext()) {
			Student s = i.next();
			if(s.getRollno() == rollno) {
				i.remove();
			}
		}
	}
	
	public void updateByRollNo(int rollno, double updateMark){
		for(Student s : students) {
			if(s.getRollno() == rollno) {
				s.setPercentage(updateMark);
			}
		}
	}
}
