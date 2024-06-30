package demo123;

public class Employee {
	
	//Data memebers
	//Class variables
	
	String name;
	int age;
	double salary;
	boolean isPerm;
	
//	String name ="Jayu";
//int age = 30;
	//double salary =4500;
	//boolean isPerm = true;

	public static void main(String[] args) {
		
		//create the obj of the class Employee = using new keyword
		
		Employee obj = new Employee();// here 'obj' is the name of reference.// here only single object is created.
		
		obj.name = "Bhagya";
		obj.age = 25;
		obj.isPerm = true;
		obj.salary = 25000;
		System.out.println(obj.name);
		System.out.println(obj.age);
		System.out.println(obj.isPerm);
		System.out.println(obj.age);
		
		System.out.println(obj.name + " " +obj.age + " " + obj.salary + " " + obj.isPerm);// this will print everything in single line.
		
		Employee e1 = new Employee(); // creating another object. but have not initialized with any values.
		
		System.out.println(e1.name + " " +e1.age + " " + e1.salary + " " + e1.isPerm);// since var are not initialzed, default will be displayed.
																					// name is Null, age is 0, Sal is 0.0 and isPerm is False.
		
	// suppose if i declare some values to all 4 variables outside main method.. then 2 object reference e1 would display all those values instead default values.(var which are commented)
		
		//No reference objects, means no name is given to the object.Not recommeneded as it consumes lot of memory.Below 4 different objects will be created 
		new Employee().name = "Peter";
		new Employee().age = 35;
		new Employee().salary= 20000;
		new Employee().isPerm = false;
		
		Employee e2 = new Employee();// new objecy by name e2 is created
		e2.name = "Papu";
		System.out.println(e2.name); // Papu
		
	//	e2 = null; // here i am disconnecting object e2 with assigned reference and making it null.
		
	//	System.out.println(e2.name); //NPE
		
	//	e2.age = 40;// null.age = 40 : NPE (Null pointer exception)
	//	System.out.println(e2.age);// NPE
		
		
		//
		Employee e3 = new Employee();
		e3.name = "Sachin";
		System.out.println(e3.name); // Sachin 
		
		e3 = null;
		e3 = new Employee(); //new object is created again
		e3.name = "testing";
		e3.age = 22;
		System.out.println(e3.name); // testing
		System.out.println(e3.age); // 22
		
		//
		
//		Employee e4; //
//		e4 = new Employee();// another way of creating object together line 74 and 75
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		

	}

}
