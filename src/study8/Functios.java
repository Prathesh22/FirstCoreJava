package study8;

import java.util.Scanner;

public class Functios {
	public static int add(int a, int b) {
		int sum = a + b;
		return sum;
	}	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int ans = add(a,b);
		System.out.println("sum of two numbers :" +ans);
	}
}		// TODO Auto-generated method stub
		
	

		

	


