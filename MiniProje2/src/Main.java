import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//sesli harf kalın mı ince mi?
		char karakter = 'E';
		
		switch (karakter) {
			case 'A':
			case 'U':
			case 'I':
			case 'O':
			case 'a':
			case 'u':
			case 'ı':
			case 'o':
				System.out.println("Kalın sesli bir harftir.");
				break;
			case 'E':
			case 'Ü':
			case 'İ':
			case 'Ö':
			case 'e':
			case 'ü':
			case 'i':
			case 'ö':
				System.out.println("İnce sesli bir harftir");
				break;
			default:
				System.out.println("Sessiz bir harftir.");
				break;
		}
	}

}
