import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DemoFindAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try	(
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_db","root","root");
				PreparedStatement pstmt = con.prepareStatement("SELECT * FROM tbl_student"); // ? map to columns in the table we want to insert
			)
		{
			
			
			
			
			ResultSet rs = pstmt.executeQuery(); // firing QUERY.... // result set query on specific condition
			while(rs.next()) { // next() method returns
				System.out.print(rs.getInt(1)+", ");
				System.out.print(rs.getString(2)+", ");
				System.out.print(rs.getDouble(3)+", ");
				System.out.print(rs.getInt(4)+", ");
				System.out.println(rs.getDate(5));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
