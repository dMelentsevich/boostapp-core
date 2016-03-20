package resources.actions;
import java.sql.*;  
public class RegisterDao {  
  
public static int save(RegisterAction r){  
int status=0;  
try{  
Class.forName("oracle.jdbc.driver.OracleDriver");  
Connection con=DriverManager.getConnection(  
"jdbc:mysql://127.0.0.1:3306/testbase","root","123");
  
PreparedStatement ps=con.prepareStatement("insert into strutsuser values(?,?,?,?,?)");  
ps.setString(1,r.getName());  
ps.setString(2,r.getPassword());  
ps.setString(3,r.getEmail());  
ps.setString(4,r.getGender());  
ps.setString(5,r.getCountry());  
          
status=ps.executeUpdate();  
  
}catch(Exception e){e.printStackTrace();}  
    return status;  
}  
}  