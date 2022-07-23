/*
 * B38. Create a class with a method that prints "This is a parent class" and its subclass with another method that prints "This is child class". Now, create an object for each of the class and call
 *  1 - method of parent class by object of parent class 
 *  2 - method of child class by object of child class
 *  3 - method of parent class by object of child class 
 */
package oops;
class parent{
	void display()
	{
		System.out.println("this is parent class");
	}
}
class sub extends parent{
	void print()
	{
		super.display();
	}
	void display()
	{
		System.out.println("this is child class");
	}
}
public class b38 {
	public static void main(String[] args) {
		parent ob1=new parent();
		sub ob2=new sub();
		ob1.display();
		ob2.display();
		ob2.print();
	}
}
