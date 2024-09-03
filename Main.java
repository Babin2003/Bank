package mypack;
import java.sql.*;
import java.util.*;
public class Main {
	//private static String accountName;

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		DbConnection con=new DbConnection();
		con.getDBconnection();
Scanner sc=new Scanner(System.in);
System.out.println("This Bank belong to the Goverment Aided and work for peoples need.\nPlease Follow the instrucution which shows to do");
System.out.println("\nSelect the numbers for help!\n----------------------------\n0.SignUp\n1.check Balance\n2.withdraw\n3.Deposit\n4.LogIn"); 
System.out.println("Enter the number\n");
int n=sc.nextInt();
sc.nextLine();
Account ac=new Account();
int count=0;
if(n==0)
{
	Account account=new Account();
	System.out.println("Enter the name\n");
	String name=sc.nextLine();
	if(count==0)
	{
		String s=name;
		char a[]=s.toCharArray();
		int c=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>='a'&&a[i]<='z'||a[i]>='A'&&a[i]<='Z')
			{
				c++;
			}
			else
			{
				System.out.print("Inappropiate nam.!Please Enter the valid name");
			  return;
			}
			
		}
		if(c==a.length)	
		{
			count++;
			account.setCustomerName(name);
		}
	}
	//System.out.println(count);
	if(count==1)
	{
	System.out.println("Enter the Email\n");
	String Email=sc.nextLine();
     String s=Email;
    // int accept=0,need=0,error=0;
     if(s.contains("@"))
     {
    	 account.setCustomerEmail(Email);
    	 count++;
    	 //return;
    //	 accept=1;
     }
     else
     {
    	 System.out.print("Invalid Email");
    	 return;
     } 
	}
	if(count==2)
	{
	System.out.println("Enter the no\n");
	String no = sc.nextLine();
	String s=no;
	char a[]=s.toCharArray();
	int c=0;
	for(int i=0;i<a.length;i++)
	{
		if(a.length<10)
		{
			System.out.println("Need 10 numbers to reserve a account number");
			return;
		}
		if(Character.isDigit(a[i]))
		{
			c++;
		}
		else
		{
			System.out.print("Enter valid Account number please!");
			return;
		}
	}
	if(c==a.length)
	{
	account.setCustomerPhone(no);
	count++;
	}
	}
if(count==3)
{
	System.out.println("Enter the pin number");
	String pinNumber=sc.next();
	int c=0,co=0;
	if(pinNumber.length()<5) {
		String s=pinNumber;
		char a[]=s.toCharArray();
		for(int i=0;i<a.length;i++)
		{
			if(Character.isDigit(a[i]))
			{
				c++;
			}
			else
			{
				System.out.print("Enter the valid Pin number only in 4 digits");
				return;
			}
		}
//		System.out.println(c);
		//System.out.println(a.length);
		if(c==a.length)
		{
			account.setPinNumber(pinNumber);
			count++;
		}
	}
	else
	{
		System.out.print("Invalid Pin Number must contains 4 digits");
		return;
	}
}
	if(count==4)
	{
	con.addAccount(account,n);
	System.out.print("sign in sucessfully");
	}
}
ac.setBalance(0.0);

if(n==1) {
	Account ack=new Account();
	ack.checkBalance(0.0,n);
	System.out.println("Your Bank Account Balance"+ack.getBalance());
}
 if(n==2)
{
	 Account newWithdraw=new Account();
	 System.out.println("Enter the Ammount to withdraw from your account\n");
double withdraw=sc.nextDouble();
newWithdraw.checkBalance(withdraw,n);

}
else if(n==3)
{
	System.out.println("Enter the Ammount to Depsoit\n");

}
else if(n==4)
{
	Account account=new Account();

	Login ok=new Login();
System.out.println("Enter the account Number");
String accountNumber=sc.nextLine();
account.setAccountNumber(accountNumber);
ok.setAccountNumber(accountNumber);

System.out.println("Enter the pin Number");
String pinNumber=sc.nextLine();
account.setPinNumber(pinNumber);
//Login login = new Login();
ok.setPinNumber(pinNumber);
con.loginAccount(account,n);
}
else if(n>10)
{
	System.out.print("Something went Wrong");
}
//account.withdrawalFunds(50.0);

	}

}
