import java.util.List;
import java.util.Scanner;

import in.co.vwits.sms.dao.impl.StudentDaoImpl;
import in.co.vwits.sms.model.Student;

public class TestStudent {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StudentDaoImpl dao = new StudentDaoImpl();
		int option = 1;

		do {
			System.out.println("Welcom to Student Management..........");
			System.out.println("1. Find All Records ");
			System.out.println("2. Insert Records ");
			System.out.println("3. Find student by Roll No. ");
			System.out.println("4. Delete student by Roll No. ");
			System.out.println("5. Update Mark. ");
			System.out.println("-1. To Exit");
			System.out.println("Enter your choice:");
			
			option = sc.nextInt();
			
			switch(option) {
			case 1:	 
				//show all students
				List<Student> students = dao.findAll();

				System.out.println(students);
				break;
				
			case 2:
				//
				Student s = new Student();
				System.out.println("Enter students Deatails");
				//Accept value from user
				System.out.print("Roll No: ");
				s.setRollno(sc.nextInt());
				System.out.print("Name: ");
				s.setName(sc.next());
				System.out.print("Percentage: ");
				s.setPercentage(sc.nextDouble());
				dao.save(s);
				System.out.println("Student saved Successfully");
				break;
				
			case 3:
				System.out.println("Find the student record");
				System.out.println("Enter the rollno: ");
				Student foundstudent = dao.findByRollNo(sc.nextInt());
				if(foundstudent != null)
					System.out.println("Found student: "+foundstudent);
				else
					System.out.println("Student not found........");
				break;
				
			case 4:
				System.out.println("Delete the student record");
				System.out.println("Enter the rollno: ");
				dao.deleteStudent(sc.nextInt());
				break;
				
			case 5:
				System.out.println("Update the record ");
				System.out.println("Enter the Id:  ");
				int rollno = sc.nextInt();
				System.out.println("Enter the Mark:  ");
				double updateMark = sc.nextDouble();
				dao.updateByRollNo(rollno, updateMark);
				System.out.println("Update successfully ");
				break;
				
			case -1:
				System.out.println("Thankyou for visiting");
				break;

			}
		}while(option!=-1);

	}

}
