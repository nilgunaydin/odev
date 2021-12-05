package odev_2cd_week_done;

import java.util.Scanner;

public class now1 {
	public static void main(String[] args) {
		
	//	Soru 11 
	Scanner scan = new Scanner(System.in);	
		
	System.out.println("lütfen bir sifre yaziniz...");
	
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
System.out.println("lütfen bir sayý giriniz...");
int sayi = scan.nextInt();

if (sayi%5==0) {if (sayi%2==0) {System.out.println("5’e bölünen çift sayý");
	
} else {System.out.println("5’e bölünen tek sayý");

}
	
} else {System.out.println("Tekrar deneyin");

}


// Interview Question
System.out.println("lütfen bir yýl giriniz...");

int yil =scan.nextInt();
if (yil%4==0) {if (yil%100==0 && yil%400!=0) {System.out.println("girdiðiniz yýl artýk yýl deðiildir.");
	
} else {System.out.println("girdiðiniz yýl artýk yýldýr.");

}
	
} else {System.out.println("girdiðiniz yýl artýk yýl deðiildir.");

}
	
	scan.close();}
	
	
	}}
