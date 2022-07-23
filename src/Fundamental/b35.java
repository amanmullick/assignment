
/*
 * B35.Write a Java program to break an integer into a sequence of individual digits. 
 * TestData
 * Input six non-negative digits: 123456
 *  ExpectedOutput : 1 2 3 4 5 6  
 */
package Fundamental;
import java.util.*;
public class b35 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 List<Integer> list=new ArrayList<Integer>();  
			//list.add(0);
			//list.add(5);		
			//System.out.println("list = "+list);
			int rem=0;
		System.out.print("enter a number : ");
		int n=sc.nextInt();
		while(n>0)
		{
			rem=n%10;
			n=n/10;
			list.add(rem);
			System.out.println("digits = "+rem);
		}
		
		Collections.reverse(list);
		for(Integer remainder:list)
			System.out.print(remainder+" ");
	}
	
}
