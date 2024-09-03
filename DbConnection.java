package mypack;
import java.sql.*;
public class DbConnection {
	Connection con;
	Connection connection;
	PreparedStatement pstmt;
	String query; 

	//String b="ok";
	//Double c=account.getBalance();
	//int d=account.getCustomerPhone();
	public void getDBconnection() throws SQLException 
	{
		
		String url="jdbc:mysql://localhost:3306/Bank";
		String userName="root";
		String password="Babin@2003";
		try {
			con = DriverManager.getConnection(url, userName, password);
			//System.out.println("Db Connected");
		} catch (SQLException e) {
			System.out.println("DB CONNECTION ERROR\n"+e);
		}
	}
	String url="jdbc:mysql://localhost:3306/Bank";
	String userName="root";
	String password="Babin@2003";
	public void loginAccount(Account account,int n) {
	if(n==4)
	{
		 String enteredUsername = account.getAccountNumber();
	        String enteredPassword = account.getPinNumber();
System.out.println(account.getAccountNumber());
System.out.println(account.getPinNumber());
	        
	        try (Connection connection = DriverManager.getConnection(url, userName, password)) {
	            // Query to fetch user details based on username
	            String query = "SELECT pin FROM login WHERE accountNumber = ?";
	            
	            try (PreparedStatement statement = connection.prepareStatement(query)) {
	                statement.setString(1, enteredUsername);
	                
	                try (ResultSet resultSet = statement.executeQuery()) {
	                    if (resultSet.next()) {
	                        String actualPassword = resultSet.getString("pin");
	                        
	                        // Compare entered password with the password fetched from the database
	                        if (enteredPassword.equals(actualPassword)&& actualPassword!="null") {
	                            System.out.println("Login successful");
	                            // Redirect user to success page or perform further actions
	                        } else {
	                            System.out.println("Incorrect password");
	                            // Display error message
	                        }
	                    } else {
	                        System.out.println("Username not found");
	                        // Display error message
	                    }
	                }
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	}
	return;
	}
	
	//signUp page for atm;
	
	public void addAccount(Account account,int n) {
		if(n==0)
		{
			   try { 
				   PreparedStatement pst = con.prepareStatement("INSERT INTO Account (CustomerName, CustomerEmail, CustomerPhone,pinNumber) VALUES (?, ?, ?, ?)");

				// Set values for parameters
				pst.setString(1, account.getCustomerName());
				pst.setString(2, account.getCustomerEmail());
				pst.setString(3, account.getCustomerPhone());
				pst.setString(4, account.getPinNumber());

				// Execute the insert query
				pst.executeUpdate();
		           // Statement st = conn.createStatement(); 
		           // System.out.print(b);
				pst.close();
		            con.close(); 
		        } catch (Exception e) { 
		            System.err.println("Got an exception! "); 
		            System.err.println(e.getMessage()); 
		        } 
			return;
		}
		
		
}

	
}