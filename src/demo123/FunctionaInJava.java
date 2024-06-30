package demo123;

public class FunctionaInJava {
	
	
	//Functions : Data memeber of the calss
	//functions cant be called inside another function
	//functions are independant
	//function can call another function
	
	//with no input and no return
	// "void" means it cant return anything
		
	public void test() {
		
		System.out.println("test method");
	//	return 100;                // it gives compiler error saying void cant return a value, Hence void and return cant be used together.
	}
	
	public void getInfo() {
		int a = 10;
		int b= 20;
		int c=a+b;
		System.out.println(c);
				
	}
	
	// no input with some return
	// return type is int
	
	public int getAmountBill() {
		
		int foodbill = 100;
		int tax = 20;
		int finalamount = foodbill+tax;
		return finalamount;
	}
	//
		public String getTrainerName(){
			
			System.out.println("get trainer name");
			String name = "Bhagya";
			return name;
		
			}
		
		//some input and some retrun;
		
		public int add(int a, int b) {
			
			System.out.println("adding 2 numbers");
			int sum = a+b;
			return sum;
		}
		
		// next example
		
		public double getTotalMarks(int firstsub, int secsub, double negmarking) {
			
			System.out.println("getting total marks");
			
		//	int totalmarks = firstsub+secsub; // here even thought its not giving any error, its  bad practice not using all para that are being passed.
			
			double totalmarks = firstsub+secsub-negmarking; // since final output result is in double we should store it in double, hence return type is in double.
			return totalmarks;
		}

	public static void main(String[] args) {
		
		FunctionaInJava obj = new FunctionaInJava(); // we are creating obj ref to call a method.
		obj.test();
		obj.getInfo();	
		int x=obj.getAmountBill(); // in the main method obj.getamoutnbill is called and it goes to emthod and retruns finalamount which will return to main method
													// and get stored in a int variable x.
		System.out.println(x);
		String A = obj.getTrainerName();
		System.out.println(A);
		
		int d = obj.add(20, 30);
		System.out.println(d);
		
		int e = obj.add(-10, 35);
		System.out.println(e);
		
		double s=obj.getTotalMarks(100, 80, 12.5);          // we have to store it in double
		System.out.println(s);
		
		
		// TODO Auto-generated method stub

	}

}
