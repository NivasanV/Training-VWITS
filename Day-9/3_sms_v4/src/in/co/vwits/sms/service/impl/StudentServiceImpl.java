package in.co.vwits.sms.service.impl;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import in.co.vwits.model.exception.StudentNotFoundException;
import in.co.vwits.sms.dao.impl.StudentDaoImpl;

import in.co.vwits.sms.model.Student;

public class StudentServiceImpl {

	private StudentDaoImpl dao;

	public StudentServiceImpl() {
		dao = new StudentDaoImpl();
	}
	// single line comment

	/*
	 * Multiple line comment
	 */

	/**
	 * DOCUMENTATION Comment find all the student details who score more than given
	 * percentage
	 * 
	 * @parameter percentage
	 * @return java.util.List<Student>
	 */
	public List<Student> findAllStudentsScoredMoreThan(double percentage) {
		return dao.findAll().stream().filter(student -> student.getPercentage() > percentage)
				.collect(Collectors.toList());
	}

	public List<Student> findAllStudentsScoredLessThan(double percentage, int attempts) {
		return dao.findAll().stream().filter(student -> student.getNumberOfAttempts() < attempts)
				.filter(student -> student.getPercentage() < percentage).collect(Collectors.toList());
	}

	public long findTotalCountofStudentsStartsWith(String s) {
		return dao.findAll().stream().filter(student -> student.getName().startsWith(s)).count();
	}

	public List<Student> findAllStudentsStartsWith(String s) {
		return dao.findAll().stream().filter(student -> student.getName().startsWith(s)).collect(Collectors.toList()); // toList
																														// is
																														// after
																														// jdk
																														// 16
	}

	public List<Student> findAllStudentSortedByPercentage() {
		return dao.findAll().stream().sorted().collect(Collectors.toList()); // collector for before jdk 16
	}

	public List<String> findStudentNameWhoScoredMoreThanGivenPercentage(double percentage) {
		return dao.findAll().stream().filter(student -> student.getPercentage() > percentage)
//				.map(student -> student.getName())
				.map(Student::getName).collect(Collectors.toList());
	}

	public List<Student> findAllStudentsLearningSpecificSubject(String subject) {
		return dao.findAll().stream()
				.filter(student -> student.getSubjectsLearning().stream().anyMatch(sub -> sub.equals(subject)))
				.collect(Collectors.toList());
	}
	
	public List<Student> findAllStudentsBornBeforeSpecificDate(LocalDate SpecificDate){
		return dao.findAll().stream()
				.filter(student -> student.getDateOfBirth().isBefore(SpecificDate))
				.collect(Collectors.toList());
	}
	
	public long findStudentsCountBornAfterSpecificDate(LocalDate SpecificDate){
		return dao.findAll().stream()
				.filter(student -> student.getDateOfBirth().isAfter(SpecificDate))
				.count();
	}

	public List<Student> findAllStudentsBornBetweenSpecificDates(LocalDate startDate, LocalDate endDate){
		return dao.findAll().stream()
				.filter(student -> student.getDateOfBirth().isBefore(endDate))
				.filter(student -> student.getDateOfBirth().isAfter(startDate))
				.collect(Collectors.toList());
	}
	
	public Map<Boolean, List<Student>> partioningStudentsBasedOnMarks(double mark){
		return dao.findAll().stream()
				.collect(Collectors.partitioningBy(s -> s.getPercentage() > mark));
	}
	
	public long findUniqueSubjects() {
		return dao.findAll().stream()
				.flatMap(s->s.getSubjectsLearning().stream())
				.distinct()
				.count();
	}
	
	public List<Student> findAll() {
		return dao.findAll();
	}

	// Create
	public void save(Student s) {
		dao.findAll().add(s);
	}

	// Find
	public Optional<Student> findByRollNo(int rollno) throws StudentNotFoundException {
		Optional<Student> p = dao.findByRollNo(rollno);
		if(p.isPresent()) {
			return p;
		}
		else {
			// throw user-defined exception "StudentNotFound";
			throw new StudentNotFoundException();
		}
	}

	// delete
	public void deleteStudent(int rollno) {
		Iterator<Student> i = dao.findAll().iterator();
		while (i.hasNext()) {
			Student s = i.next();
			if (s.getRollno() == rollno) {
				i.remove();
			}
		}
	}

	public void updateByRollNo(int rollno, double updateMark) {
		for (Student s : dao.findAll()) {
			if (s.getRollno() == rollno) {
				s.setPercentage(updateMark);
			}
		}
	}
	

}
