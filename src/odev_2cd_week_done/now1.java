package odev_2cd_week_done;

import java.util.Scanner;

public class now1 {
	public static void main(String[] args) {
		
	//	Soru 11 
	Scanner scan = new Scanner(System.in);	
		
	System.out.println("l�tfen bir sifre yaziniz...");
	
	char s = scan.next().charAt(0);
	
	if (s>='A' && s<='Z') { if (s=='A') {System.out.println("Gecerli Sifre");
		
	} else {System.out.println("Gecersiz Sifre");

	}
		
	} else if(s>='a'&& s<='z') {
if(s=='z') {
	System.out.println("Gecerli Sifre");
} else {System.out.println("Gecersiz Sifre");


	}
	//Soru12
System.out.println("l�tfen bir say� giriniz...");
int sayi = scan.nextInt();

if (sayi%5==0) {if (sayi%2==0) {System.out.println("5�e b�l�nen �ift say�");
	
} else {System.out.println("5�e b�l�nen tek say�");

}
	
} else {System.out.println("Tekrar deneyin");

}


// Interview Question
System.out.println("l�tfen bir y�l giriniz...");

int yil =scan.nextInt();
if (yil%4==0) {if (yil%100==0 && yil%400!=0) {System.out.println("girdi�iniz y�l art�k y�l de�iildir.");
	
} else {System.out.println("girdi�iniz y�l art�k y�ld�r.");

}
	
} else {System.out.println("girdi�iniz y�l art�k y�l de�iildir.");

}
	
	scan.close();}
	
	
	}}
