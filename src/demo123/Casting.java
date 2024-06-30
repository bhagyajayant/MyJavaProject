package demo123;

public class Casting {

	public static void main(String[] args) {
		
		byte a = 100;
		byte b = 50;
		
	//	byte c=a+b; // cannot add 2 variables declared as bytes even though they are within the range. bcoz values can change any time which out of range values.
					//Hence it needs to be typecasted. If we typecast to short complier will still give error for the same above reason, hence it should be deaclared as int
		int c=a+b;
		System.out.println(c);
		
		byte p=120;
		byte q= 100;
		
	//	byte r=q-p /// here also same reason.hence declare it as int
		int r=q-p;
		System.out.println(r);
										
		short d= 300;
		short e= 400;
		int f= d+e;// here instead of short we should declare it as int for the same above reason.
		
		System.out.println(f);

		byte x= -120;
		int y= x;				// byte var can be assigned to int which is bigger in size. small box can be fit into big box
								// its called widening or implicit type casting.. storing small box into big box
		System.out.println(y);
		
		int x1 = 100;
//		byte y1= x1; // here i cant store int value into byte.. as trying to fit smaller box into bigger.
					// its called narrowing or explciit type casting..trying to fit big box into small box
		byte y1= (byte)x1;
		System.out.println(y1);
		
		int a1=145;
		byte b1 =(byte)a1;
		System.out.println(b1); // since 230 is out of range for byte it will, here it will print as -111 => 145-256 , bcoz byte supports upto 256 values including 0. 
		//Hence we should deduct from 256
		
		char c1= 'a'; //97
		byte bb= (byte)c1;
		System.out.println(bb);// since value is within the range , data is not lost even after typecast
		
		double d1=12.33;
		int d2=(int)d1;
		System.out.println(d2);// it will print 12, we lose decimal value
		
		double dd1 =1123.456;
		short dd2=(short) dd1;
		System.out.println(dd2);// since value is within short range it prints 1123 but losing decimal point.
		
		char t1 ='a';
		char t2='b';
		System.out.println(t1*t2);
		System.out.println(t1+t2);
		System.out.println(t1-t2);
		System.out.println(t1/t2);
		System.out.println(t1+" "+t2);// since "" is considered as string and left to right cal happens.. here concatenation happens hence a b will be printed.
		System.out.println(t1+' '+t2);// since '' is considered as char , cal happens hence 97+32+98 =>227
		System.out.println(' '+' ');// 64
		System.out.println(" "+' ');// double space... adding string with char, hence result will be string which is concatenation. Both should be char then only Ascii will be considered.
		System.out.println((byte)1000);
		
		System.out.println(' '+' '+" ");//32+32 spce
		System.out.println(" "+' '+' ');
		
		
		
		
		
		
		
		
		
		
	}

}
