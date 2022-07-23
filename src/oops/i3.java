/*
 * I3. Write a program which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
 *  Marks Grade
 *   91-100 AA
 *   81-90 AB
 *   71-80 BB 
 *   61-70 BC 
 *   51-60 CD 
 *   41-50 DD 
 *   <=40 Fail  
 
 */
package oops;
import java.util.*;
class result
{
	int m;
	public void input()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the marks : ");
		m=sc.nextInt();
	}
	public void marks()
	{
		if(m>=91 && m<=100)
		{
			System.out.println("result = AA ");
		}
		else if(m>=81 && m<=90)
		{
			System.out.println("result = AB ");
		}
		else if(m>=71 && m<=80)
		{
			System.out.println("result = BB ");
		}
		else if(m>=61 && m<=70)
		{
			System.out.println("result = BC ");
		}
		else if(m>=51 && m<=60)
		{
			System.out.println("result = CD ");
		}
		else if(m>=41 && m<=50)
		{
			System.out.println("result = DD ");
		}
		else if(m<=40)
		{
			System.out.println("result = FAIL ");
		}
	}
	
}
public class i3 {
	public static void main(String[] args) {
	result ob=new result();
	ob.input();
	ob.marks();
}
}