/*
 * B37. Create a class to print the area of a square and a rectangle. The class has two methods with the same name but different number of parameters. The method for printing area of a rectangle has two parameters which are length and breadth respectively while the other method for printing area of square has one parameter which is side of square. 
 */
package oops;
class Shape{
	void area(int l,int b)
	{
		System.out.println("area of rectangle = "+(l*b));
	}
	void area(int s)
	{
		System.out.println("area of square = "+(s*s));
	}
}

public class b37 {
	public static void main(String[] args) {
		Shape ob= new Shape();
		ob.area(5,2);
		ob.area(5);
		
	}
}
