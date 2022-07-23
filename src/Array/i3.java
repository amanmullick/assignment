/*
 * I3. W.A.J.P to insert an element (specific position) into an array. 
 */
package Array;
import java.util.*;
public class i3 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a[]=new int[3];
		System.out.println("enter array elements : ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.print("enter the position to be inserted : ");
		int pos=sc.nextInt();
		System.out.print("enter the element to be inserted : ");
		int ele=sc.nextInt();
		int size=a.length;
		for(int i=(size-1);i>=(pos);i--)
		{
			a[i]=a[i-1];
			//size++;
		}
		size++;
		a[pos-1]=ele;
		for(int i=0;i<size;i++)
		{
			System.out.println(a[i]);
		}
	}
}
