package BusinessLogicLayer;
import java.sql.*;  
public class CustomerOrders {
    // totalPrice,Staff,Staff_Charges,UName,eventtype,Function,Place,Light,Lightning_Charges,Sitting_Charges,;
	public void InserCustorder(String Name,String Event, String Function,String Place, String Lightning_Charges,String Sitting_Charges,String Staff_Charges , String totalPrice,String dateofevent,String custorThem){  
		try{  
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection(  
		"jdbc:mysql://localhost:3306/eventmangmentsystem","root","password");  
		Statement stmt=con.createStatement();  
		System.out.println("inserting customer orders");
		
		  
		String query="INSERT INTO eventmangmentsystem.customerorder( customerName, Event, Type, Place, LightningCharges, SittingChages, StaffCharges, FoodCharges, DateOfEvent,eventSetup) VALUES (?, ?, ?, ?, ?, ?, ?, ?,?,?)";            	
	
		PreparedStatement statement =  con.prepareStatement(query) ;
		statement.setString(1,Name);
		statement.setString(2,Event);
		statement.setString(3,Function);
		statement.setString(4,Place);
		statement.setString(5,Lightning_Charges);
		statement.setString(6,Sitting_Charges);
		statement.setString(7,Staff_Charges);
		statement.setString(8,totalPrice);
		statement.setString(9,dateofevent);
		statement.setString(10,custorThem);
		int resultSet = statement.executeUpdate();
		}
		
		catch(Exception e){ 
			System.out.println(e);
			}  
		  
	
}
	
}
