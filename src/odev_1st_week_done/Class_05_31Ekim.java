package odev_1st_week_done;

import java.util.Scanner;

public class Class_05_31Ekim {

	public static void main(String[] args) {


	Scanner scan= new Scanner(System.in);
	
	System.out.println("L�tfen bir sayi giriniz...");
	
	int sayi= scan.nextInt();
	
	if (sayi%2==0) {System.out.println("Girdi�iniz say� �irf say�d�r");
		
	} else {System.out.println("Girdi�iniz say� tek say�d�r...");

	}
	//2.soru
	
System.out.println("l�tfen gun isimlerinden birinin ilk harfini giriniz...");
	
    String harf = scan.next().substring(0,1);
	
	switch (harf.toUpperCase()){	

	case "P":
		System.out.println( "Pazar, Pazartesi veya Persembe");
		break;
	case "S" :
		System.out.println("Sal�");
		break;
	case "C" :
		System.out.println("Carsamba, Cuma veya Cumartesi");
		break;
	default :
		System.out.println("Lutfen gecerli bir harf giriniz...");
	}

	//3.soru
	
	System.out.println("l�tfen g�n ad� giriniz...");
	String gun = scan.next().toUpperCase();
	
	switch (gun) {
	case "PAZARTES�":
	case "SAL�":
	case "CARSAMBA":
	case "PER�EMBE":
	case "CUMA":
		System.out.println("haftaici");
			break;
	case "CUMARTES�":
	case "PAZAR":
		System.out.println("haftasonu");
		break;
	default:System.out.println("g�n ismi girer misin cnm");
	}
	
	
	//4.soru
	System.out.println("l�tfen dikd�rtgenin kenar uzunluklar�n� giriniz \n ilkini girdikten sonra 2. i�in entera bas�n�z...");
	int kn1= scan.nextInt();
	int kn2 = scan.nextInt();
	
	if (kn1==kn2) {
		System.out.println("girdiginiz dikd�rtgen bir kare");
		
	} else {System.out.println("girdiginiz dikd�rtgen bir kare de�il");

	}
	
	
	// 5. soru
	
System.out.println("l�tfen bir gun ismi giriniz...");

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
default: System.out.println("b�yle bir kutsal g�n bulunamad�");
}
scan.close();
}}
