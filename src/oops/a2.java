/*
 * A2. Suppose a class 'A' has a static method to print "Parent". Its subclass 'B' also has a static method with the same name to print "Child". Now call this method by the objects of the two classes. Also, call this method by an object of the parent class referring to the child class i.e. A obj = new B () 
 */
package oops;
class a
{
	public static void print()
	{
		System.out.println("parent");
	}
}
class b extends a
{
	public static void print()
	{
		System.out.println("child");
	}
}
public class a2 {
	public static void main(String[] args) {
		a o=new a();
		o.print();
		b o1=new b();
		o1.print();
		a obj=new b();
		obj.print();
	
	}
}
