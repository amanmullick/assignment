/*
 * B39. Create a class named 'Member' having the following members: 
 * Data members 1 - Name 2 - Age 3 - Phone number 4 - Address 5 - Salary 
 * It also has a method named 'printSalary' which prints the salary of the members.
 *  Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively.
 *   Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these classes and print the same. 
 */
package oops;
 class Member
{
	String name;
	int age,pno;
	String address;
	double salary=100000;
	
	void printSalary()
	{
		System.out.println("salary = "+salary);
	}
}
 class employee extends Member{
	 String specialization;
	 void print(String name, int age) {
		 System.out.println("name = "+name);
		 System.out.println("age = "+age);
	 }
 }
 class manager extends Member
 {
	 String department;
	 void print(String name, int age) {
		 System.out.println("name = "+name);
		 System.out.println("age = "+age);
	 }
 }
class b39{
	public static void main(String[] args) {
		employee ob=new employee();
		ob.print("aman", 20);
		ob.printSalary();
		manager ob2=new manager();
		ob2.print("ravi", 20);
		ob2.printSalary();
	}
}