import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DemoUpdateById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try	(
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","root");
				PreparedStatement pstmt = con.prepareStatement("UPDATE tbl_student SET attempts=? WHERE rollno=? "); // ? map to columns in the table we want to insert
			)
		{
			
			// Before actually firing the QUERY you must set the values for all ?
			pstmt.setDouble(1, 3); // 1st ? is for attempts
			pstmt.setInt(2, 3); // 2nd ? is for rollno
			
			
			int noOfRowUpdated = pstmt.executeUpdate(); // firing QUERY
			System.out.println("No of Records Updated are "+ noOfRowUpdated);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
