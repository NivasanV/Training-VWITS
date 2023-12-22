package in.co.vwits.sms.model;

import java.time.LocalDate;
import java.util.List;

public class Student implements Comparable<Student> {

	private int rollno;
	private String name;
	private double percentage;
	private int numberOfAttempts;
	private List<String> subjectsLearning;
	private LocalDate dateOfBirth;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public int getNumberOfAttempts() {
		return numberOfAttempts;
	}

	public void setNumberOfAttempts(int numberOfAttempts) {
		this.numberOfAttempts = numberOfAttempts;
	}

	public List<String> getSubjectsLearning() {
		return subjectsLearning;
	}

	public void setSubjectsLearning(List<String> subjectsLearning) {
		this.subjectsLearning = subjectsLearning;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}


	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", percentage=" + percentage + ", numberOfAttempts="
				+ numberOfAttempts + ", subjectsLearning="+ subjectsLearning + ", dateOfBirth=" + dateOfBirth + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return (int) (o.percentage - this.percentage);
	}

}
