/*
 * B13. W.A.J.P to calculate the average value of array elements. 
 */

package Array;
import java.util.*;
public class b13 {
public static void main(String[] args) {
	int a[]= {1,2,3,4,6};
	int sum=0;
	double avg=0;
	for(int i=0;i<5;i++)
	{
		sum=sum+a[i];
	}
	avg=(double)sum/5;
	System.out.println("average = "+avg);
}
}
