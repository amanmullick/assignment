/*
 * I6. W.A.J.P to find the duplicate values of an array of string values. 
 */
package Array;

public class i6 {
	
	public static void main(String[] args) {
		int count=0;
		String s[]= {"aa","bb","cc","aa"};
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].compareTo(s[j])==0)
				{
					count++;
					System.out.println("duplicate found : " + s[j]);
				}
				
			}
		}
		if(count==0)
		{
			System.out.println("no duplicate element found");
		}
	}
}

