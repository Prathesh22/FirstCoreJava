package study8;

public class Functions2 {
    public static int mul(int a, int b){
	return a * b;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Multiplication of two numbers :" + mul(a,b));

	}

}
