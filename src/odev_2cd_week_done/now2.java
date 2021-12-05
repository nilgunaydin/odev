package odev_2cd_week_done;

import java.util.Scanner;

public class now2 {

	public static void main(String[] args) {
		
//		Soru1 
		
		Scanner scan= new Scanner(System.in);
		System.out.println("lütfen günün haftanýn kaçýncý günü olduðunu yazýnýz... ");
		int day= scan.nextInt();
		switch(day) {
			case 1:
				System.out.println("pazartesi");
break;
			case 2:
				System.out.println("salý");
break;
			case 3:
				System.out.println("çarþamba");
break;
			case 4:
				System.out.println("perþambe");
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
					System.out.println("1-7 arasý bir tamsayý giriniz...");
		}
		
//		Soru2 
		System.out.println("lütfen ayýn yýlýn kaçýncý ayý olduðunu yazýnýz... ");
		int m = scan.nextInt();
		switch(m) {
			case 1:
				System.out.println("ocak");
break;
			case 2:
				System.out.println("þubat");
break;
			case 3:
				System.out.println("mart");
break;
			case 4:
				System.out.println("nisan");
break;
			case 5:
				System.out.println("mayýs");
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
				System.out.println("eylül");
break;
			case 10:
				System.out.println("ekim");
break;
			case 11:
				System.out.println("kasým");
				break;
			case 12:
				System.out.println("aralýk");
				break;
				default:
					System.out.println("1-12 arasý bir tamsayý giriniz...");
		}
		
		
		
		
		//	Soru3

		System.out.println("lütfen bir sayý giriniz...");
		double sayi = scan.nextDouble();
		if (sayi==10) {System.out.println("Iki basamakli en kucuk sayi");
			
		} else if (sayi==100){System.out.println("uc basamakli en kucuk sayi");

		} else if (sayi==1000){System.out.println("dort basamakli en kucuk sayi");}
		else {System.out.println("Girdigin sayiyi degistir");}
		
		
		//	Soru4 
		System.out.println("SDET kisaltmasindaki harflerden birini yazýn");
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
