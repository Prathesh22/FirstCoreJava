package study16;

public class Parent {
	void show() {
		System.out.println("abc");
	}
	class Child extends Parent{
		void show() {
			System.out.println("pqr");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Parent();
		p.show();
		Parent p1 = new Child();
		p1.show();

	}

}
//overriding