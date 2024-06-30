package demo123;

public class ExceptionHandling {

	String name;
	
	public static void main(String[] args) {
				
		System.out.println("Exception handling");
		System.out.println("A");
		System.out.println("B");
		System.out.println("c");
		
		ExceptionHandling obj=new ExceptionHandling();
		
		obj=null;
		// Below exceptions are runtime /unchecked exceptions
		try {
			int i=9/0; // ARthimatic Expression
			//obj.name ="Bhagya";
		//	System.out.println("will this be printed?");
		}
		
		catch(ArithmeticException e){    // here 'e' is the reference name
			
			System.out.println("AE is identified");
			e.printStackTrace(); //printStackTrace- will display package-class-method- line no at which exception is thrown. it will help to debug the code.
		}
		catch(NullPointerException e) {
			System.out.println("NPE is thrown");
			e.printStackTrace();
		}
		catch(Exception e) {						// In exception "Exception" class should be the last exception while handling.
													//Exception is a super class of all other exceptions.So if have more exceptions to handle then we 
													// can use generic Exception class
			System.out.println("some exception is thrown");
		}
		System.out.println("print bye");
		
		// below are compile time exception OR checked exceptions
		try {
			Thread.sleep(3000);
		} 
		catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
