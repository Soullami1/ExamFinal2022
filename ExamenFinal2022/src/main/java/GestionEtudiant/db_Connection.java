package GestionEtudiant;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class db_Connection {
	
	public static Connection getConnection()
	{
		Connection con = null;
		
		try{
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			InputStream input = new FileInputStream("config.properties");
            Properties prop = new Properties();
            prop.load(input);
            
            con = DriverManager.getConnection(prop.getProperty("db.url"), prop.getProperty("db.user"), prop.getProperty("db.password"));   
            
        } catch (IOException e1) {
            e1.printStackTrace();
        } 
		catch (ClassNotFoundException e2) {
            e2.printStackTrace();
        } catch (SQLException e3) {
            e3.printStackTrace();
        }
		
		return con;
	}

}
