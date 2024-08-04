package study14;

public class Static3 {
	//Static variable
	static int a = m1();
	//static block
	static {
		System.out.println("Static block");
	}
	// static method
	static int m1() {
		System.out.println("from m1");
		return 10;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("value of a :" + a);

	}

}
