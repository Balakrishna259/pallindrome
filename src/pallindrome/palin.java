package pallindrome;

import java.util.Scanner;
import java.lang.Math;

public class palin {

	Scanner sc = new Scanner(System.in);
	

	
public static void main(String args[]) {
	

	
	System.out.println(Math.addExact(1, 2));
	System.out.println(Math.min(5, 8));
	System.out.println(Math.abs(5.5));
	System.out.println(Math.max(23, 34));
	System.out.println(Math.incrementExact(1));
	System.out.println(Math.cosh(45));
	System.out.println(Math.log(3.0));
	System.out.println(Math.PI);
	System.out.println(Math.cos(45));
	System.out.println(Math.log10(4.0));
	
	System.out.println("Enter the String");		
	
	
   
   Scanner sc = new Scanner(System.in);
   String a = sc.nextLine();
	Palindrome(a);
	System.out.println("Enter numbers");	
	
	Scanner tc = new Scanner(System.in);
	String p = tc.nextLine();
	String[] r = p.split(",");
	double[] q = new double[r.length];
	for (int i = 0; i < q.length; i++) {
	    q[i] = Double.parseDouble(r[i]);
	}
	Difference diff = new Difference();
	System.out.println(diff.differ(q));
	
}





public static void Palindrome(String test) {
	
	String b = test.replaceAll(" ", "");
	char[] charArray = b.toCharArray();
	//System.out.println(charArray.length);
	String s = null;
	if(charArray.length!=0) {
		for(int i=0; i<charArray.length;i++) {
		
	       if(charArray[i]==charArray[charArray.length-1-(i)]) {
			//charArray[i]=charArray[i+1];
			//charArray[charArray.length-1-i]=charArray[charArray.length-1-(i+1)];
			s = "Given string is a palindrome";
		}
	       else { 
	   		 s = "Given string is not a pallindrome";
	   	}
			
	}
	}
		else { 
	   		 s = "Given string is not a pallindrome";
	   	}
	
	
	 
		System.out.println(s);	
}
}


