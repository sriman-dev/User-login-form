package Register2;
import java.sql.*;  
import static Register2.provider.*;  
	  
   public class connection {  
	
	private static Connection con=null;  
	static{  
	try{  
	Class.forName(DRIVER);  
	con=DriverManager.getConnection(CONNECTION_URL,USERNAME,PASSWORD);  
	}
	catch(Exception e){}  
	}  
	  
	public static Connection getCon(){  
	    return con;  
	}
   }

