package odev_2cd_week_done;

import java.util.Scanner;

public class now2 {

	public static void main(String[] args) {
		
//		Soru1 
		
		Scanner scan= new Scanner(System.in);
		System.out.println("l�tfen g�n�n haftan�n ka��nc� g�n� oldu�unu yaz�n�z... ");
		int day= scan.nextInt();
		switch(day) {
			case 1:
				System.out.println("pazartesi");
break;
			case 2:
				System.out.println("sal�");
break;
			case 3:
				System.out.println("�ar�amba");
break;
			case 4:
				System.out.println("per�ambe");
break;
			case 5:
				System.out.println("cuma");
break;
			case 6:
				System.out.println("cumartesi");
				break;
			case 7:
				System.out.println("pazar");
				break;
				default:
					System.out.println("1-7 aras� bir tamsay� giriniz...");
		}
		
//		Soru2 
		System.out.println("l�tfen ay�n y�l�n ka��nc� ay� oldu�unu yaz�n�z... ");
		int m = scan.nextInt();
		switch(m) {
			case 1:
				System.out.println("ocak");
break;
			case 2:
				System.out.println("�ubat");
break;
			case 3:
				System.out.println("mart");
break;
			case 4:
				System.out.println("nisan");
break;
			case 5:
				System.out.println("may�s");
break;
			case 6:
				System.out.println("haziran");
				break;
			case 7:
				System.out.println("temmuz");
				break;
			case 8:
				System.out.println("agustos");
break;
			case 9:
				System.out.println("eyl�l");
break;
			case 10:
				System.out.println("ekim");
break;
			case 11:
				System.out.println("kas�m");
				break;
			case 12:
				System.out.println("aral�k");
				break;
				default:
					System.out.println("1-12 aras� bir tamsay� giriniz...");
		}
		
		
		
		
		//	Soru3

		System.out.println("l�tfen bir say� giriniz...");
		double sayi = scan.nextDouble();
		if (sayi==10) {System.out.println("Iki basamakli en kucuk sayi");
			
		} else if (sayi==100){System.out.println("uc basamakli en kucuk sayi");

		} else if (sayi==1000){System.out.println("dort basamakli en kucuk sayi");}
		else {System.out.println("Girdigin sayiyi degistir");}
		
		
		//	Soru4 
		System.out.println("SDET kisaltmasindaki harflerden birini yaz�n");
		char c = scan.next().charAt(0);
			switch(c) {
			case 'd':
			case 'D':
				System.out.println("Developer");
				break;
			case 'e':
			case 'E':
			System.out.println("Engineer");
			break;
			case 't':
			case 'T':
			System.out.println("In Testing");
			break;
			case 's':
			case 'S':
				System.out.println("Software");
				break;
			default:
				System.out.println("tekrar deneyiniz...");
			} 
			scan.close();
	}

}
