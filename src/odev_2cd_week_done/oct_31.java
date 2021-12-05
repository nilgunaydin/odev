package odev_2cd_week_done;

import java.util.Scanner;

public class oct_31 {

	public static void main(String[] args) {

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("lütfen bir karakter giriniz...");
		
		char ch= scan.next().charAt(0);
		if ((ch>='A' && ch<='Z') || (ch>='a' && ch<='z')) {
			System.out.println("girdiðiniz karakter bir harftir" );
		} else {System.out.println("girdiðiniz karakter bir harf deðildir");
		
		}

//Soru 3
		
		int age = scan.nextInt();
		
		if (age<65) {System.out.println("emekli olamazsýn.");
			
		} else { System.out.println("emekli olabilirsin");

		}
		
//Soru 4
int kn1= scan.nextInt();
int kn2= scan.nextInt();
int kn3= scan.nextInt();
	if (kn1==kn2 && kn2==kn3) {System.out.println("bu bir eþkenar üçgendir");
		
	} else {System.out.println("bu bir eþkenar üçgen degildir");	}
	scan.close();}

}
