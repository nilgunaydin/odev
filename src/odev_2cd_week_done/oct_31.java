package odev_2cd_week_done;

import java.util.Scanner;

public class oct_31 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("l�tfen bir karakter giriniz...");
		
		char ch= scan.next().charAt(0);
		if ((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')) {
			System.out.println("girdi�iniz karakter bir harftir" );
		} else {System.out.println("girdi�iniz karakter bir harf de�ildir");
		
		}

//Soru 3
		
		int age = scan.nextInt();
		
		if (age<65) {System.out.println("emekli olamazs�n.");
			
		} else { System.out.println("emekli olabilirsin");

		}
		
//Soru 4
int kn1= scan.nextInt();
int kn2= scan.nextInt();
int kn3= scan.nextInt();
	if (kn1==kn2 && kn2==kn3) {System.out.println("bu bir e�kenar ��gendir");
		
	} else {System.out.println("bu bir e�kenar ��gen degildir");	}
	scan.close();}

}
