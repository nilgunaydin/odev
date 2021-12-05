package replit;

import java.util.Scanner;

public class sss {
	  public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
 //Write a return method to reverse number.
//Input : 12345
//Output : 54321
		  String num= scan.next();
		 System.out.println(TersCevir(num));
		  
		    }

	private static String TersCevir(String num) {
	String numters = "";
	for(int i=0;i<num.length();i++){numters+= num.charAt(num.length()-(1+i));
	}	
			return numters;
	}
		  }