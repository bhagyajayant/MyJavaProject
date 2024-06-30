package demo123;

public class StringConcatenation {

	public static void main(String[] args) {
		
		int a = 100;
		int b = 200;
		
		System.out.println("the value of a is :" + a);
		System.out.println("the value of b is " + b);
		System.out.println("sum of a and b is" +(a+b));
		
		
		String x = "Hello"; // string should alway be mentioned in ""
		String y = "World";
		
		System.out.println(a+b); 
		System.out.println(x+y);// for strings it is always concatenation.
		
		System.out.println(a+x);
		System.out.println(a+b+x+y);// concatenation happens from left to right
		System.out.println(x+y+a+b);// here output is helloworld100200, here a and b are not added.
		System.out.println(x+y+(a+b));//helloworld300);
		
		System.out.println(a+b+x+y+a+b);//300helloworld100200
		
		
		double c=12.33;
	    double d=23.44;
	    System.out.println(x+y+c+d); //HelloWordl12.3323.44
	    System.out.println(a+b+c+d+x+y);//335.77HellowWorld
	    
	    char c1= 'a';
	    char c2= 'b';
	    System.out.println(c1+c2+x+y); // 195HellowWorld
	    System.out.println(c1+c2);//195
	    System.out.println(c1+""+c2);
	    System.out.println(x+" "+y);
	    
	    String t1= "a";
	    String t2 = "b";
	    System.out.println(t1+t2);//ab
	    
	    System.out.println(c1+' '+c2);// 227 here ascii values are added
	    
	    System.out.println(true+x);// truehello
	    System.out.println('a'+'b'+"hello"+"selenium"+100+200+12.33);
	    //195helloworldselenium10020012.33
	    
	    		
		
		

	}

}

