
/*
 * B24. Write a Java program to display Pascal's triangle.
 *  	1 
 *     1 1 
 *    1 2 1 
 *   1 3 3 1 
 *  1 4 6 4 1 
 */
package Fundamental;

public class b24 {
	public static void main(String[] args) {
		int k=11;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(Math.pow((int)k,(int)j));
			}
			System.out.println();
		}
	}
}
