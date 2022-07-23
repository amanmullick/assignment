/*
 * B36. Create a class to print an integer and a character with two methods having the same name but different sequence of the integer and the character parameters. 
 */
package oops;
class abc{
	void fun(int a, char c)
	{
		System.out.println("first method called ");
		System.out.println("a = "+a+" c = "+c);
	}
	void fun(char c, int a)
	{
		System.out.println("second method called ");
		System.out.println("c = "+c+" a = "+a);
	}
}
public class b36 {
	public static void main(String[] args) {
		abc ob =new abc();
		ob.fun(1,'a');
		ob.fun('z',	99);
	}
}
