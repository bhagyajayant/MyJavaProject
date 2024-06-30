package demo123;

public class Employee1 {

	public static void main(String[] args) {
		
		System.out.println("A");
		try {
			int i=9/0;
		}
		catch(Throwable e) {
			e.printStackTrace();
		}
		
		System.out.println("bye");
	}
	

}
