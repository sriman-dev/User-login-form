package Register2;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Reg1 {
	public static int register(user u){  
		int status=0;  
		try{  
		Connection con=connection.getCon();  
		PreparedStatement ps=con.prepareStatement("insert into user values(?,?,?)");  
		ps.setString(1,u.getUname());  
		ps.setString(2,u.getUemail());  
		ps.setString(3,u.getUpass());  
		              
		status=ps.executeUpdate();  
		}catch(Exception e){}  
		      
		return status;  
		
		}
	
}
