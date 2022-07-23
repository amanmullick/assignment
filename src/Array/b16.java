/*
 * B16. W.A.J.P to find the maximum and minimum value of an array. 
 */
package Array;
 class max_min{
		public int a[]= {252,3,998,4,789};
		
	void max() {
		 int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("max = "+max);
		}

	
	void min() {
		 int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("min = "+min);
		}
	}
	
public class b16 {
	public static void main(String[] args) {
		max_min ob =new max_min();
		ob.max();
		ob.min();
		
}
}

