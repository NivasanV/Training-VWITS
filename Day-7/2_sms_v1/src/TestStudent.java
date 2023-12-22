import java.util.List;
import java.util.Scanner;

import in.co.vwits.sms.model.Student;
import in.co.vwits.sms.service.impl.StudentServiceImpl;

public class TestStudent {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		StudentServiceImpl service = new StudentServiceImpl();
		int option = 1;

		do {
			System.out.println("Welcom to Student Management..........");
			System.out.println("1. Find All Records ");
			System.out.println("2. Insert Records ");
			System.out.println("3. Find student by Roll No. ");
			System.out.println("4. Delete student by Roll No. ");
			System.out.println("5. Update Mark. ");
			System.out.println("6. Find All who scored more than Specific percentage. ");
			System.out.println("7. Find All who scored less than Specific percentage and less than Attemps. ");
			System.out.println("8. Find All Name Starts With Specific Character. ");
			System.out.println("9. Print the Student in Decensending order. ");
			System.out.println("10. Student Name list more than 90.");
			System.out.println("-1. To Exit");
			System.out.println("Enter your choice:");
			
			option = sc.nextInt();
			
			switch(option) {
			case 1:	 
				//show all students
				List<Student> students = service.findAll();

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
				service.save(s);
				System.out.println("Student saved Successfully");
				break;
				
			case 3:
				System.out.println("Find the student record");
				System.out.println("Enter the rollno: ");
				Student foundstudent = service.findByRollNo(sc.nextInt());
				if(foundstudent != null)
					System.out.println("Found student: "+foundstudent);
				else
					System.out.println("Student not found........");
				break;
				
			case 4:
				System.out.println("Delete the student record");
				System.out.println("Enter the rollno: ");
				service.deleteStudent(sc.nextInt());
				break;
				
			case 5:
				System.out.println("Update the record ");
				System.out.println("Enter the Id:  ");
				int rollno = sc.nextInt();
				System.out.println("Enter the Mark:  ");
				double updateMark = sc.nextDouble();
				service.updateByRollNo(rollno, updateMark);
				System.out.println("Update successfully ");
				break;
				
			case 6:
				System.out.println("Enter Percentage :");
				System.out.println(service.findAllStudentsScoredMoreThan(sc.nextDouble()));
				break;
				
			case 7:
				System.out.println("Enter Percentage :");
				System.out.println("Max Attempts :");
				double percentage = sc.nextDouble();
				int attempts = sc.nextInt();
				System.out.println(service.findAllStudentsScoredLessThan(percentage, attempts));
				break;
				
			case 8:
				System.out.println("Enter Statring Letters :");
				System.out.println(service.findAllStudentsStartsWith(sc.next()));
				break;
			
			case 9:
				System.out.println(service.findAllStudentSortedByPercentage());
				break;
				
			case 10:
				System.out.println("Student Name list more than 90:");
				System.out.println(service.findStudentNameWhoScoredMoreThanGivenPercentage(90));
			
			case -1:
				System.out.println("Thankyou for visiting");
				break;

			}
		}while(option!=-1);

	}

}
