
public class Main {

	public static void main(String[] args) {
		//mükemmel sayı mı?
		int number=28;
		int sayac=0;
		for(int i=1;i<number;i++) {
			int remainder = number%i;
			if(remainder==0) {
				sayac=sayac+i;
			}
		}
		
		if(sayac==number) {
			System.out.println("Mükemmel bir sayıdır");
		}else if(number<=1){
			System.out.println("Geçersiz değer girdiniz.");
		}else {
			System.out.println("Mükemmel bir sayı değildir");
		}

	}

}
