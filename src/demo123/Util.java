package demo123;

public class Util {
	
	String name;
	int age;
	static final String compName ="Google"; // we have used to keyword "final" to make it as constant and cant be changed.
	
		public void getInfo(){
		System.out.println("get information");
	}
	public static void sendMail() {
		System.out.println("send mail");
	}

public static void main(String[] args) {
		
		Util u= new Util();
		
		//how to access no static var and methods
		
		u.age =30;
		u.name = "Bhagya";
		u.getInfo();
	//	u.compName = "Philips"; // we can access static var using object, compiler does not give any error but gives warning.
								// hence this is not the right way to access static var or methods.
		
		//how to access static var and methods
		//using class name
		
		System.out.println(Util.compName);
		Util.sendMail();
		
		//access directly
		System.out.println(compName);
		sendMail();
		
		
		
		
}
}
