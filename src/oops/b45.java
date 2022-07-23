/*
 * B45. We have to calculate the percentage of marks obtained in three subjects (each out of 100) by student A and in four subjects (each out of 100) by student B. Create an abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two other classes 'A' and 'B' each having a method with the same name which returns the percentage of the students. The constructor of student A takes the marks in three subjects as its parameters and the marks in four subjects as its parameters for student B. Create an object for eac of the two classes and print the percentage of marks for both the students. 
 */
package oops;
abstract class marks{
	abstract public void getpercentage();
	
}
class studentA extends marks{
	int sum=0;
	studentA (int a,int b,int c){
	sum=(a+b+c)/3;	
	}
	
	public void getpercentage() {
		System.out.println("the percentage of student A = "+sum+" %");
	}	
}

class studentB extends marks{
	int sum=0;
	studentB (int m1,int m2,int m3, int m4){
	sum=(m1+m2+m3+m4)/4;	
	}
	
	public void getpercentage() {
		System.out.println("the percentage of student b = "+sum+" %");
	}	
}
public class b45 {
	public static void main(String[] args) {
		studentA ob =new studentA(50,86,95);
		ob.getpercentage();
		studentB ob1 =new studentB(80,75,72,90);
		ob1.getpercentage();
	}
}
