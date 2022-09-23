
public class Main {

	public static void main(String[] args) {
		// Arkadaş sayı
		int number1=17296;
		int number2=18416;
		int total1=0;
		int total2=0;
		for(int i=1;i<number1;i++) {
				int remainder1= number1 % i;
				if(remainder1==0) {
					total1=total1+i;
				}
		}
		
		for(int j=1;j<number2;j++) {
			int remainder2= number2 % j;
			if(remainder2==0) {
				total2=total2+j;
			}
		}
		
		if(number1==total2 && number2==total1) {
			System.out.println("Değerler arkadaş sayılardır.");
		}else if(number1<=1 || number2<=1) {
			System.out.println("Geçerli değerler giriniz.");
		}else {
			System.out.println("Değerler arkadaş sayı değiller.");
		}

	}

	
}
