package mypack;
import java.sql.*;
public class Login {
private String accountNumber ;
private String pinNumber;
static int checking=0;
//Login login=new Login();
public void checkLogin( String accountNumber,String pinNumber)
{
	int n=0;
	if(n==0)
	{
		String s=accountNumber;
		char a[]=s.toCharArray();
		if(a.length==10)
		{
			n++;
		}
		else
		{
			System.out.print("Account Number must in 10 digits");
			return;
		}
		int count=0;
		if(n==1)
		{
			for(int i=0;i<a.length;i++)
			{
				if(Character.isDigit(a[i]))
				{
					count++;
				}
			}
			if(count==a.length)
			{
				System.out.print("Valid Account Number");
			}
			else
			{
				System.out.print("Sorry enter valid account number");
			}
		}
		}
}
public String getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}
public String getPinNumber() {
	return pinNumber;
}
public void setPinNumber(String pinNumber) {
	this.pinNumber = pinNumber;
}



}

