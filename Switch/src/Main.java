
public class Main {

	public static void main(String[] args) {
		char grade= 'F';
		
		switch(grade) {
			case 'A':
				System.out.println("Çok iyi: Geçtiniz");
				break;
				
			case 'B':
				System.out.println("İyi : Geçtiniz");
				break;
			
			case 'C':
				System.out.println("Ortalama : Geçtiniz");
				break;
				
			case 'D':
				System.out.println("Ortalama altı : Geçtiniz");
				break;
				
			case 'F':
				System.out.println("Geçemediniz");
				break;
				
			default:
				System.out.println("Geçersiz not girildi.");
		}

	}

	
}
