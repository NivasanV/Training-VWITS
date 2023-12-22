import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DemoFindById {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try	(
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","root");
				PreparedStatement pstmt = con.prepareStatement("SELECT * FROM tbl_student WHERE rollno=? "); // ? map to columns in the table we want to insert
			)
		{
			
			// Before actually firing the QUERY you must set the values for all ?
			pstmt.setInt(1, 1);
			
			
			ResultSet rs = pstmt.executeQuery(); // firing QUERY.... // result set query on specific condition
			if(rs.next()) { // next() method returns
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getDouble(3));
				System.out.println(rs.getInt(4));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
