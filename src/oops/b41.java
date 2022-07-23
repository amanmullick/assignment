/*
 * B41. Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units 
 * by creating a class named 'Triangle' without any parameter in its constructor
 */
package oops;
class triangle{
	int a=3;
	int b=4;
	int c=5;
	void area()
	{
		System.out.println("area of triangle = "+(0.5*b*c));
	}
	void peri()
	{
		System.out.println("perimeter of triangle = "+(a+b+c));
	}
	
}
public class b41 {
public static void main(String[] args) {
	triangle ob=new triangle();
	ob.area();
	ob.peri();
}
}
