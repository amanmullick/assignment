
/*
 * B12. W.A.J.P to sum values of an array. 
 */
package Array;
import java.util.*;
public class b12 {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<5;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum = "+sum);
	}
}
