/*I2. We have to calculate the area of a rectangle, a square and a circle. Create an abstract class 'Shape' with three abstract methods namely 'RectangleArea' taking two parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its side and that of 'CircleArea' is its radius. Now create another class 'Area' containing all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the area of rectangle, square and circle respectively. Create an object of class 'Area' and call all the three methods. 
 */
package oops;
abstract class FFF{
	abstract public void rectanglearea(int l,int b);
	abstract public void squarearea(int s);
	abstract public void circlearea(int r);
}
class aman extends FFF{

	public void rectanglearea(int l, int b) {
		System.out.println("area of rectangle = "+(l*b));		
	}

	public void squarearea(int s) {
		System.out.println("area of square = "+(s*s));
	}

	public void circlearea(int r) {
		System.out.println("area of circle = "+(3.14*r*r));
	}
}
public class i2 {
	public static void main(String[] args) {
		aman ob = new aman();
		ob.circlearea(5);//o.squarearea(7);
	//o.circlearea(8);
	}
}
