package study14;

public class Static4 {
	private static String str = "abc";
	//static class
	static class NestedClass{
		public void disp() {
			System.out.println(str);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Static4.NestedClass n = new Static4.NestedClass ();
		n.disp();

	}

}
// Static keyword with static class
