import java.util.Scanner;

import org.w3c.dom.css.CSSImportRule;

public class Main {

	public static void main(String[] args) {
		// iç içe yerine farklı döngüler kullanılırsa return kullanabilirsin.
		// Asal sayı mıdır? 
		Scanner scan = new Scanner(System.in);
		System.out.println("1'den büyük değer giriniz.");
		int sayac=0;
		int number = scan.nextInt();
		if(number<1) {
			System.out.println("Geçerli bir değer giriniz");
		}else if(number==1){
			System.out.println("Asal bir sayı değildir.");
		}else {
			for(int i=2;i<number;i++) {
				int remainder= number % i;
				if(remainder==0) {
					sayac++;
				}
			}
			if(sayac==0 || number==2) {
				System.out.println("Asal bir sayıdır.");
			}else{
				System.out.println("Asal bir sayı değildir.");
			}
		}
	}

	
}
