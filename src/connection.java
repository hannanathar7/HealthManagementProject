import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class connection {

	private static Connection con=null;
	
	public static Connection dbConnect()
	{
		
		try {
			Class.forName("org.sqlite.JDBC");
			con=DriverManager.getConnection("jdbc:sqlite:database.db");
		return con;
		}
		catch (ClassNotFoundException | SQLException e)
		{
			JOptionPane.showMessageDialog(null,e);
			return null;
		}
	}
}
