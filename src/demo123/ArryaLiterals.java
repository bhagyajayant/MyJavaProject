package demo123;

import java.util.Arrays;

public class ArryaLiterals {

	public static void main(String[] args) {
		
		//1.Array declaration using new keyword, this is used when i dont know what data am storing.
				
//		int a[] = new int[10];
		
		//2. Using array literals, this is used when i know what data i am storing..
		int i[]={1,4,10,6,45,78,30};// 
		
		System.out.println(i.length);// prints length of the array
		System.out.println("li = "+ 0);// lowest index
		System.out.println("hi = "+(i.length-1));// highest index
		
		System.out.println(i[0]);
		
		for(int e : i) {
			
			System.out.println(e);
		}
		
		System.out.println(Arrays.toString(i));// it will print entire array.
		
		String students[] = {"Bhagya", "Jayu","Rajji", "Bush"};
		System.out.println(students.length);
		System.out.println(Arrays.toString(students));
		
				
		
		
		
	}

}
