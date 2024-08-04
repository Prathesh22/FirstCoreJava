package study15;

public class sum {
	public int sum(int x, int y) {
		return (x + y );
	}
	public int sum(int x, int y, int z)
	{
		return (x + y + z);
	}
	public double sum(double x, double y)
	{
		return (x + y);
	}
	

      public static void main(String[] args) {
		// TODO Auto-generated method stub
    	  sum s = new sum();
    	  System.out.println(s.sum(5,10));
    	  System.out.println(s.sum(10 ,5,2));
    	  System.out.println(s.sum(2.5,10.5));

	}

}
//Method Overloading
