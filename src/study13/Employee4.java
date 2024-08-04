package study13;

public class Employee4 {
	Employee4()
	{
		this(5);
		System.out.println("Employee Raj");
		
	}
	Employee4(int i)
	{
		this(5,15);
		System.out.println(i);
	}
	Employee4(int i, int a)
	{
		System.out.println(i * a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Employee4();

	}

}
//default constructor chaining within same class using this(
//keyword