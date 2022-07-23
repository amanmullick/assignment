/*
 * B44. Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and $200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC' are subclasses of class 'Bank', each having a method named 'getBalance'. Call this method by creating an object of each of the three classes. 
 */
package oops;
abstract class bank{
	abstract public void getbalance();
}
class bankA extends bank{
	public void getbalance()
	{
		System.out.println("bankA = 100$ ");
	}
}

class bankB extends bank{
	public void getbalance()
	{
		System.out.println("bankB = 150$ ");
	}
}

class bankC extends bank{
	public void getbalance()
	{
		System.out.println("bankC = 200$ ");
	}
}
public class b44 {
	public static void main(String[] args) {
		bankA ob1=new bankA();
		bankB ob2=new bankB();
		bankC ob3=new bankC();
		ob1.getbalance();
		ob2.getbalance();
		ob3.getbalance();
	}
}
