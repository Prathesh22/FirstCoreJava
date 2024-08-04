package study13;

public class Employee2 {
	int empid;
	String empname;
	 Employee2(int id, String name)
	 {
		 id = empid;
		 name = empname;	 
	 }
	 void display() {
	 System.out.println(empid+empname );
	 }
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Employee2 E = new  Employee2( 22,"Raj");
		 E.display();

	}

}
//parameterized constructor
