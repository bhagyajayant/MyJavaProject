package demo123;

public class Testing {

	public static void main(String[] args) {
		
		
		int a[]= new int[3];     //AIOB exception, ArrayIndexOutofBound
		try {
			a[3]=10;
		}
		catch(ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		
		System.out.println("bye");
	}

}
