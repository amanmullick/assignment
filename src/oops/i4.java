/*I4. Create a class named 'Shape' with a method to print "This is This is shape". Then create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both having a method to print "This is rectangular shape" and "This is circular shape" respectively. Create a subclass 'Square' of 'Rectangle' having a method to print "Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the object of 'Square' class.*/

package oops;

class shape{
	public void pshape()
	{
		System.out.println("this is shape ");
	}
}

class rectangle extends shape{
	public void prec()
	{
		System.out.println("this is  rectangle ");
	}
}
class circle extends shape 
{
	public void pcir()
	{
		System.out.println("this is circle ");
	}
}

class square extends rectangle{
	public void psq()
	{
		System.out.println("square is a rectangle");
	}
}
public class i4{
	public static void main(String[] args) {
		square ob=new square();
		ob.prec();
		ob.pshape();
	}
}