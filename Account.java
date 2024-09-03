package mypack;

public class Account {
private Double balance;
private String customerName;
private String customerEmail;
private String customerPhone;
private String pinNumber;
private String accountNumber;
public String getPinNumber() {
	return pinNumber;
}
public void setPinNumber(String pinNumber) {
	this.pinNumber = pinNumber;
}
public void checkBalance(Double balance,int n)
{
	if(n==1)
	{

		System.out.print("Your Current Balance is "+balance);
	}
}
public void depositFunds(double depositeAmount,int n)
{
	if(n==3)
	{
		
	this.balance+=depositeAmount;
	System.out.println("Deposit ammount "+depositeAmount+" made a new balance "+this.balance);
}
}
public void withdrawalFunds(double withdrawalAmount,int n)
{
	if(n==2)
	{
		//String k="null";
	if(balance-withdrawalAmount<0)
	{
		System.out.println("InSuffiecient amount");
	}
	else
	{
		balance-=withdrawalAmount;
		System.out.println("Withrawal of amount "+withdrawalAmount+" processed, Remaining balance =" +balance);
	}
	}
}
public Double getBalance() {
	return balance;
}
public void setBalance(Double balance) {
	this.balance = balance;
}
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public String getCustomerEmail() {
	return customerEmail;
}
public void setCustomerEmail(String customerEmail) {
	this.customerEmail = customerEmail;
}
public String getCustomerPhone() {
	return customerPhone;
}
public void setCustomerPhone(String customerPhone) {
	this.customerPhone = customerPhone;
}
public String getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}



}
