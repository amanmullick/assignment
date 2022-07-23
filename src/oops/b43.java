package oops;
abstract class parent{
	public abstract void message();
}
class sub1 extends parent{
	public void message() {
		System.out.println("This is first subclass");
	}
}
class sub2 extends parent
{
	public void message()
	{
		System.out.println("This is second subclass");
	}
}
public class b43 {
	public static void main(String[] args) {
		sub1 ob1=new sub1();
		sub2 ob2=new sub2();
		ob1.message();
		ob2.message();
	}
}
