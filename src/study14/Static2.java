package study14;

public class Static2 {
	static int a = 5;
	static int b;
	static {
		System.out.println("This is Static Block");
		b = a * 4;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("value of a : " + a);
		System.out.println("value of b : " + b);
		

	}

}
//Static Block