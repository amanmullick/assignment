
/*B25. Write a Java program that reads a positive integer and count the number of digits the number. Input an integer number less than ten billion: 125463 Number of digits in the number: 6 */

package Fundamental;
import java.util.*;
public class b25 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("enter thhe number : ");
		int n=sc.nextInt();
		while(n>0)
		{
			int rem=n%10;
			n=n/10;
			count++;
		}
		System.out.println(count);
	}
	
}
