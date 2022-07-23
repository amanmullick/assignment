/*
 * A5. W.A.J.P to cyclically rotate a given array clockwise by one.
 *  Original array: [10, 20, 30, 40, 50, 60] 
 *  Rotated array: [60, 10, 20, 30, 40, 50] 
 */
package Array;

public class a5 {
	public static void main(String[] args) {
		int a[]= {10,20,30,40};
		int last=a[a.length-1];
		//System.out.println(a[a.length-1]);
		for(int i=a.length-1;i>0;i--)
		{
				a[i]=a[i-1];
		}
				a[0]=last;
		
		for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]);	
		}
	}
}
