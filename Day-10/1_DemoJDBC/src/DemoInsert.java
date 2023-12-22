import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DemoInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try	(
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","root");
				PreparedStatement pstmt = con.prepareStatement("INSERT INTO tbl_student VALUES(?,?,?,?) "); // 4 ? map to columns in the table we want to insert
			)
		{
			
			// Before actually firing the QUERY you must set the values for all ?
			pstmt.setInt(1, 5);
			pstmt.setString(2, "Ravi");
			pstmt.setDouble(3, 79.8);
			pstmt.setInt(4, 4);
			
			
			int noOfRowUpdated = pstmt.executeUpdate(); // firing QUERY
			System.out.println("No of Records Updated are "+ noOfRowUpdated);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
