/*
 * A1. All the banks operating in India are controlled by RBI. RBI has set a well-defined guideline (e.g. minimum interest rate, minimum balance allowed, maximum withdrawal limit etc) which all banks must follow. For example, suppose RBI has set minimum interest rate applicable to a saving bank account to be 4% annually; however, banks are free to use 4% interest rate or to set any rates above it. 
 
Write a JAVA program to implement bank functionality in the above scenario and demonstrate the dynamic polymorphism concept. Note: Create few classes namely Customer, Account, RBI (Base Class) and few derived classes (SBI, ICICI, PNB etc). Assume and implement required member variables and functions in each class.
 */
package oops;
abstract class rbi{
	public abstract void interest();
	public void reporate()
	{
		System.out.println("reporate = 4%");
	}
}
class customer{
	public void customerData()
	{
		System.out.println("customer details");
	}
}
class account
{
	public void AcoountDetails()
	{
		System.out.println("the account details ");
	}
}
class sbi extends rbi{

	public void interest() {
		System.out.println("sbi interst 5%");
	}
	
}
class pnb extends rbi{

	public void interest() {
		System.out.println("interest of pnb = 6%");
	}
}
public class a1 {
	public static void main(String[] args) {
	sbi ob = new sbi();
	ob.reporate();
	ob.interest();
	
	pnb ob1=new pnb();
	ob1.interest();
	}
}
