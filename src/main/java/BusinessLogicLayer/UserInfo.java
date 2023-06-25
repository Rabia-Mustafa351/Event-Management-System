package BusinessLogicLayer;
import java.sql.*;  
public class UserInfo {
	public void InserCustData(String Name,String CNIC, String Email,String PhoneNo, String Adress , String Pswd){  
		try{  
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/eventmangmentsystem","root","password");  
		Statement stmt=con.createStatement();  
		System.out.println("inserting Records");
		
		  
		String query="Insert into customer (NAME, CNIC, EMAIL, PHONE, ADRESS, PASSWORD) values(?,?,?,?,?,?)";            	
	
		PreparedStatement statement =  con.prepareStatement(query) ;
		statement.setString(1,Name);
		statement.setString(2,CNIC);
		statement.setString(3,Email);
		statement.setString(4,PhoneNo);
		statement.setString(5,Adress);
		statement.setString(6,Pswd);
		int resultSet = statement.executeUpdate();
		}
		
		catch(Exception e){ 
			System.out.println(e);
			}  
		  
	
}
	
	public  int checkingLogIn(String UName, String Pwdd){
		 ResultSet rs = null;
		 String name;
		 String Passwordd;
		 int tempvar;
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/eventmangmentsystem","root","password");  
			Statement stmt=con.createStatement();  
			System.out.println("inserting Records");
			
			 String query = "select * from customer";
			PreparedStatement statement =  con.prepareStatement(query);
			 rs=statement.executeQuery();
			// System.out.println("id\t\tname\t\temail");
			 
	            // Condition check
	            while (rs.next()) {
	                 name = rs.getString("NAME");
	                 Passwordd = rs.getString("PASSWORD");
	                 System.out.println("Name=" + name+ "    Passwordd=" + Passwordd);
	                 if(name.equals(UName) && Passwordd.equals(Pwdd))
	                 {
	                	 System.out.println("11111Name=" + name+ "EEEEPasswordd" + Passwordd);
	                	 tempvar=3;
	                	 return tempvar;
	                 }
	            }
			}
			
			catch(Exception e){ 
				System.out.println(e);
				}  
		return 1;	
	}
		
	}	 