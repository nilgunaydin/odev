package odev_1st_week_done;

import java.util.Scanner;

public class Class_05_31Ekim {

	public static void main(String[] args) {


	Scanner scan= new Scanner(System.in);
	
	System.out.println("Lütfen bir sayi giriniz...");
	
	int sayi= scan.nextInt();
	
	if (sayi%2==0) {System.out.println("Girdiðiniz sayý çirf sayýdýr");
		
	} else {System.out.println("Girdiðiniz sayý tek sayýdýr...");

	}
	//2.soru
	
System.out.println("lütfen gun isimlerinden birinin ilk harfini giriniz...");
	
    String harf = scan.next().substring(0,1);
	
	switch (harf.toUpperCase()){	

	case "P":
		System.out.println( "Pazar, Pazartesi veya Persembe");
		break;
	case "S" :
		System.out.println("Salý");
		break;
	case "C" :
		System.out.println("Carsamba, Cuma veya Cumartesi");
		break;
	default :
		System.out.println("Lutfen gecerli bir harf giriniz...");
	}

	//3.soru
	
	System.out.println("lütfen gün adý giriniz...");
	String gun = scan.next().toUpperCase();
	
	switch (gun) {
	case "PAZARTESÝ":
	case "SALÝ":
	case "CARSAMBA":
	case "PERÞEMBE":
	case "CUMA":
		System.out.println("haftaici");
			break;
	case "CUMARTESÝ":
	case "PAZAR":
		System.out.println("haftasonu");
		break;
	default:System.out.println("gün ismi girer misin cnm");
	}
	
	
	//4.soru
	System.out.println("lütfen dikdörtgenin kenar uzunluklarýný giriniz \n ilkini girdikten sonra 2. için entera basýnýz...");
	int kn1= scan.nextInt();
	int kn2 = scan.nextInt();
	
	if (kn1==kn2) {
		System.out.println("girdiginiz dikdörtgen bir kare");
		
	} else {System.out.println("girdiginiz dikdörtgen bir kare deðil");

	}
	
	
	// 5. soru
	
System.out.println("lütfen bir gun ismi giriniz...");

String gun2= scan.next();

switch (gun2) {
case "cuma":
	System.out.println("Muslumanlar icin kutsal gun");
	break;
case "cumartesi":
	System.out.println("Yahudiler icin kutsal gun");
	break;
case "pazar":
	System.out.println("Hiristiyanlar icin kutsal gun");
	break;	
default: System.out.println("böyle bir kutsal gün bulunamadý");
}
scan.close();
}}
