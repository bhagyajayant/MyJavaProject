package demo123;

public class DataTypes {
	
	
	public static void main(String[] args) {
		
		//above is the main method in Java..without this we cant run the program.
		
	//data types, 2 types
		 //Primitive data type-fixed space is allocated in the memory.
				//For example int, float, double etc..
		 //Non primitive data type- for these we need to create objects(oops concepts)
			//for example String , class, array,interface
		
	//1.Numeric data types
		//	a. Integral data : byte,short,int,long
		//  b.floating data: float, double
	//		c. Character:
		
	//2. Boolean : true/false
		
//1.Byte : its a keyword , hence should start with "small case"
// in real time scenario instead of int we can use byte to store AGE.
		
// there are 2 values 
// size : 1 byte (8 bits)
// value: -128 to 127
		 
		byte b = 10;
		 b = -100;
		byte c =30;
		 c= -111;
		
				
		System.out.println(c);
		 
// we cant define byte b=10 byte b=20 as it gives error saying duplicate. 
//Since B is already defined, we can just mention as b=20.. It will just update the value with latest one.
		 
	System.out.println(b);	
	
	
// in above program 3 variables of type byte are declared with each 8 bits size.
	
//3. short
//	size- 2 bytes - 16 bits
//	range- > -317468 to 317467
	
	short s1 = 12345;
	System.out.println(s1);
	
// try to use short, byte instead of int if numbers are really small can be within range
	// for better memory management
	
//4. long 
// size - 8 bytes , 64 bits
// range -
// to declare a long number we have to tell compiler explicitly by mentioning 'L/l' at the end of the number
// otherwise it will give an error
// example: population of India, distance bet earth to moon..
	
//	long l= 10000000;
//	long l1= 35734434612l;
//	System.out.println(l1);
	
// to store data like telephone number, aadhar no, postal code... we dont declare it with short,int,long or byte.
// bcoz we are not performing any arithmetic action	on them..so we declare it as string.
// its a best  practice to use right data types.
	
//5.float
// size - 4 bytes, 16 bits
// range- maximum upto 7 digits
	
	float f=10.55f;
	float f1= (float)12345.6666;
	System.out.println(f1);
	System.out.println(f);
// for float we have to explicitly mention 'f' at the end otherwise it will give complier error.
	
	
//6. Double
// size= 8 bytes, 32 bits
// range = upto 15 digits
	
 double d=1223532.56;
 double d1= 100;
System.out.println(d1);
 System.out.println(d);
 
 double d2= 1234.56f;
 System.out.println(d2);
	
//7.Character=> in Java it accepts only single digit.
 //Size= 2 bytes, 16 bits, bcoz char could be chinese, arabic which are called UNICODE, ASCII value
 //Hence instead of 1 byte 2 byte memory is allocated.
 //Character is enclosed in single quotes ''.
 //these are basically used to store below values
 // gender => F or M or O
 //Grade => A or B or C
 // Status => P or F
 
 char c1 = 'a';// a to z
 char c2 = 'A'; //A to Z
 char c3 = '0'; // 0 to 9
 char c4 = '$'; // Special characters
 char c5 = ' ';// space is also allowed
 
 System.out.println(c1);
 System.out.println(c2);
 System.out.println(c3);
 System.out.println(c4);
 System.out.println(c5);
 
 char gender = 'M';
 char exe = 'Y';
 
 System.out.println(gender);
 System.out.println(exe);
	
// Boolean ;
 // size - 1 bit
 //range - true / false
 //in Java boolean means its either true or false unlike in 0 or 1 in other languages.
 // true and false are not keywords even though they start with small case. They are called boolean literals.
 
 boolean bg = false;
 boolean flag = false;
 System.out.println(bg);
 System.out.println(flag);

 

	
	
	
			
		
		
	
		// TODO Auto-generated method stub

	}

}
