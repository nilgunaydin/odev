package odev_1st_week_done;

import java.util.Scanner;

public class class_02 {

	public static void main(String[] args) {


		
		//soru1
		
		Scanner scan = new Scanner(System.in);
		
	System.out.println("l�tfen 2 say� giriniz...");
	int sayi1 =scan.nextInt();
	
	int sayi2= scan.nextInt();
	
	System.out.println("toplam: "+ (sayi1+sayi2)+ "\n" + "fark: "+ (sayi1 - sayi2)+ "\n"+ "�arp�m: "+ (sayi1*sayi2));
	
    	//soru2
	
	Scanner scan1 = new Scanner(System.in);
	
	System.out.println("L�tfen karenin kenar uzunlugunu yaziniz...");
	int kenar = scan1.nextInt();
	
	System.out.println("Karenin �evresi="+ (kenar*4)+ "\n"+ "Karenin alani= " + (kenar*kenar));
	
	//soru3
	
	Scanner scan2 = new Scanner(System.in);
	
	System.out.println("L�tfen yar��ap giriniz...");
	
	double r = scan2.nextDouble();
	
	System.out.println("cemberin cevresi: "+ (2*3.14*r));
	
	System.out.println("dairenin alani: "+ (3.14*r*r));
	
	// soru4
	
	Scanner scan3 = new Scanner(System.in);
	
	System.out.println("l�tfen prizma kenarlari i�in 3 deger giriniz...");
	
	int uzunkenar = scan3.nextInt();
	
	int kisakenar = scan3.nextInt();
	
	int h = scan3.nextInt();
	
	System.out.println("prizma alan�= "+(uzunkenar*kisakenar*h));
	
	//soru5
	
 Scanner scan4 = new Scanner(System.in)	;
 
 
 System.out.println("L�tfen isminizi giriniz...");
 
 String isim = scan4.next();
 
 System.out.println("L�tfen soy isminizi giriniz...");
 
 String soy = scan4.next();
 
 System.out.println( "Isminiz : "+ isim+ "\n"+"Soyisminiz : "+soy+"\n \n"+"Kursumuza katiliminiz alinmistir,tesekkur ederiz");
//soru6
 Scanner scan5 = new Scanner(System.in);
 
 System.out.println("l�tden ad�n�z� giriniz...");
 
 String ad = scan5.next();
 
 System.out.println("L�tfen soyad�n�z� giriniz...");
 
 String sa = scan5.next();
 
 System.out.println("isim - soyisim : "+ ad+" "+sa);
 
 // soru7
 
 Scanner scan6 = new Scanner(System.in);
 
 System.out.println("L�tfen isinizi giriniz...");
 
 char ilkharf = scan6.next().charAt(0);
 
 System.out.println("Isminizin ba� harfi : "+ ilkharf);
 
 scan.close();
 scan1.close();
 scan2.close();
 scan3.close();
 scan4.close();
 scan5.close();
 scan6.close();
 
 
 
 
 
 
 
	}

}
