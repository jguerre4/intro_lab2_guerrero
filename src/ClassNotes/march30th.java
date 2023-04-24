package ClassNotes;

import java.util.Scanner;

public class march30th {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      int a  = scanner.nextInt();
      int b  = scanner.nextInt();
      int c  = scanner.nextInt();
      int d; 
      if (a < b && a < c) {
         d = a;
         if (b < c) {
            System.out.println(d + " " + b + " " + c);
         } else {
            System.out.println(d + " " + c + " " + b);
         }
      } else if (b < a && b < c) {
         d = b;
         if (a < c) {
            System.out.println(d + " " + a + " " + c);
         } else {
            System.out.println(d + " " + c + " " + a);
         }
      } else {
         d = c;
         if (a < b) {
            System.out.println(d + " " + a + " " + b);
         } else {
            System.out.println(d + " " + b + " " + a);
         }
      }
   }




















//package ClassNotes;
//import java.util.Scanner;
//
//public class march30th {
//	public static void main(String[] args) { 
//		int a , b; 
//		double d; 
//		//String str,str1; 
//		//char c = ' ',d ='b',e = 'c',f; 
//		Scanner scnr = new Scanner(System.in);
//		d = scnr.nextDouble(); 
//		
//		if (d == 98.5);
//			System.out.println("Works");
//		System.out.println("End");  		// enter 98.5 and 98.6
	}
}

//package ClassNotes;
//import java.util.Scanner;
//
//public class march30th {
//	public static void main(String[] args) { 
//		int a , b; 
//		String str,str1; 
//		char c = ' ',d ='b',e = 'c',f; 
//		Scanner scnr = new Scanner(System.in);
//		str = scnr.next(); 
//		
//		System.out.println(str.substring(4)); //enter "Pineapple result is apple"
//	}
//}
//package ClassNotes;
//import java.util.Scanner;
//
//public class march30th {
//	public static void main(String[] args) { 
//		int a , b; 
//		String str,str1; 
//		char c = 'a',d ='b',e = 'c',f; 
//		Scanner scnr = new Scanner(System.in);
//
//		System.out.println(Character.isLetter(c));
//	}
////package ClassNotes;
//import java.util.Scanner;
//
//public class march30th {
//	public static void main(String[] args) { 
//		int a , b; 
//		String str,str1; 
//		char c,d,e,f,g; 
//		Scanner scnr = new Scanner(System.in);
//		System.out.println("Enter First Name:"); 
//		str = scnr.next(); 
//		System.out.println("Enter Last Name:");
//		str1 = scnr.next();
//		
//		System.out.println("Full Name is: " + str.concat(" " + str1));
//package ClassNotes;
//import java.util.Scanner;
//
//public class march30th {
//	public static void main(String[] args) { 
//		int a , b; 
//		String str; 
//		char c,d,e,f,g; 
//		Scanner scnr = new Scanner(System.in);
//		System.out.println("Enter a Number"); 
//		 str = scnr.next(); 
//		
//		c = str.charAt(0); 	
//		d = str.charAt(1);
//		e = str.charAt(2);
//		f = str.charAt(3);
//		g = str.charAt(4);
//		
//		System.out.println(c + "" + d + e + f + g);
////package ClassNotes;
//import java.util.Scanner;
//
//public class march30th {
//	public static void main(String[] args) { 
//		int a =5, b; 
//		//String str; 
//		Scanner scnr = new Scanner(System.in);
//		System.out.println("Enter a Number"); 
//		a = scnr.nextInt(); 
//		
//		b = (a>3) ? a/3 : a*2 ; 
//		System.out.println("b = " + b); 
//	}
//}