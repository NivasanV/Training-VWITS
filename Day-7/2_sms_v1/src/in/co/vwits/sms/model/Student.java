package in.co.vwits.sms.model;

public class Student implements Comparable<Student>{
	private int rollno;
	private String name;
	private double percentage;
	private int numberOfAttempts;
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
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", percentage=" + percentage + ", numberOfAttempts="
				+ numberOfAttempts + "]";
	}
	@Override
    public int compareTo(Student o) {
        // TODO Auto-generated method stub
        return (int) (o.percentage-this.percentage);
	}


}
