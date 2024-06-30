package demo123;

public class Page {

	
	
	//psvm[String args[])- JVM understand only this as a main method.
//if its written as public static void (String a[])- it will still consider as main method, just that array para name is diff
	//caller method - user method
	// does not return anything, it is just used to call other methods, variables.
	//no business logic is written inside main function, hence it does not return anything.
	//JVM calls main method, it calls internally by page.main
	
//	public static void main(String a[]) {
	//	System.out.println("Hello world");
//	}
	
	// "main" method can be overloaded as mentioned below, but JVM looks for particular signature to run main method. 
	//Usually as best practice we dont use any other method name as main, use other better names.
	//Interview question: can we overload main method, yes can
	public static void main(String[] args){
		
		System.out.println("hello");
	//	Page.main(10);       //calling other static methods by its calls name Page.
	//	Page.main(20, 30);
	}
	
	/*
	 * // public static void main(int a){ // System.out.println("hi" +a); // } //
	 * public static void main(int a,int b) { // System.out.println("bye" + (a+b));
	 * // }
	 */}
