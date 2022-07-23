/*
 * B35. Create a class named 'PrintNumber' to print various numbers of different datatypes by creating different methods with the same name 'printn' having a parameter for each data type. 
 
 */
package oops;
class PrintNumber{
	void printn(int a){
		System.out.println("int "+a);
	}

	void printn(double a){
		System.out.println("double "+a);
	}

	void printn(char a){
		System.out.println("char "+a);
	}


}
public class b35 {
	public static void main(String[] args) {
		PrintNumber ob=new PrintNumber();
		ob.printn(1);
		ob.printn(3.14);
		ob.printn('a');
	}
}
