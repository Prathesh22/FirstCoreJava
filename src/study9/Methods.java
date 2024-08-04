package study9;

import java.util.Scanner;

public class Methods {
	public static int sum(int x, int y) {
		int ans = x + y; 		
	     return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int ans = sum(x,y);
		System.out.println("Addition of two numbers :" + ans );

	}

}
