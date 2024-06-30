package demo123;

public class MathematicalExpressions {

	public static void main(String[] args) {
		
		System.out.println(9/2);// int/int => int value
		System.out.println(9.0/2); // int/deci => dec value
		System.out.println(9/2.0);// one of the values is dec then result will also be in dec
		System.out.println(9.0/2.0);
//		System.out.println(9/0);// any pure integer divide by 0 gives arithemetic expression.
		System.out.println(9.0/0); // infinity, any deci no divided by 0 results to infinity
		System.out.println(0/9);// zero
		System.out.println(9/0.0); // gives infinity
		System.out.println(9.0/0.0);// infinity
//		System.out.println(0/0);// AE
		System.out.println(0.0/0.0);// NaN (Not a Number)
		System.out.println(0.0/0);// NaN
		System.out.println(0/0.0);// NaN
		System.out.println(1.45/0);//infinity
		System.out.println(0.1+0.4);// 0.5
		System.out.println(0.1+0.2);// 0.30000000000004
		
		float x = -12.345f;// always postfix with 'f' to conisder as float
		double y =  1324.67;
		System.out.println(x);
		System.out.println(y);
		char c3 = 56;
		System.out.println(c3);// since 56 is declared as char..it will print ascii value of 56
		System.out.println((byte)56); // if i want to print as 56 then it should type casted as byte
		
	}
}