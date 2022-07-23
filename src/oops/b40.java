/*
 * B40. Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods to print the area and perimeter of the rectangle respectively. Its constructor having parameters for length and breadth is used to initialize the length and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its constructor having a parameter for its side (suppose s) calling the constructor of its parent class as 
 * 'super (s, s)'. Print the area and perimeter of a rectangle and a square. 
 */
package oops;
class rectangle{
	int l,b;
	public rectangle(int length,int breadth)
	{
		this.l=length;
		this.b=breadth;
	}
	void area()
	{
		System.out.println("area = "+(l*b));
	}
	void perimeter() {
		System.out.println("perimeter = "+(2*(l+b)));
	}
}
class square extends rectangle{
	square(int s)
	{
		super(s,s);
	}
}
public class b40 {
	public static void main(String[] args) {
		rectangle b=new rectangle(2,5);
		square ob=new square(5);
		System.out.println("rectangle");
		b.area();
		b.perimeter();

		System.out.println("square");
		ob.area();
		ob.perimeter();
	}
}
