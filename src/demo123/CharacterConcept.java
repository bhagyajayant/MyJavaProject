package demo123;

public class CharacterConcept {

	public static void main(String[] args) {
		
// characters
// any mathematical operations are performed on characters it considers its corresponding ASCII values
//	
		
 char c1 = 'a'; //97
 char c2 = 'b'; //98
  System.out.println(('a'+'b'));
 System.out.println(c1+c2);
 System.out.println((byte)c1); // its called type conversion
 System.out.println(0+c2);// here its ana ddition of 0 and ascii value of c2
 System.out.println(0+'a');
 System.out.println(0+'$');
 System.out.println((byte)'%');// here we are telling println method to give ascii value of %
 System.out.println((int)c2); // here it will work, but best practice is to use byte instead of int.
System.out.println('0'+'$'); // here ascii values of o and $ are added.
System.out.println(0+'0');// here it gives ascii value of 0 if its written in ''
System.out.println(0+'~');
System.out.println('a');
System.out.println(c1);

	}

}
