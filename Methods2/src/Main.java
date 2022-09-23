
public class Main {

	public static void main(String[] args) {
		String message = "The weather is nice today.";
		// void olan fonksiyonları değişkenlere atayamazsınız.
		String newMessage = city();
		System.out.println(newMessage);
		int number = addition(15, 7);
		System.out.println(number);
		int total = addition2(2, 3, 4, 5, 6, 10);
		System.out.println(total);
	}

	public static void add() {
		System.out.println("Added");
	}

	public static void remove() {
		System.out.println("Removed");
	}

	public static void update() {
		System.out.println("updated");
	}

	public static int addition(int number1, int number2) {
		return number1 + number2;
	}

	public static int addition2(int... numbers) {
		// birden fazla int değeri göndermek için ...
		// variable arguments denir.
		int total = 0;
		for (int number : numbers) {
			total += number;
		}
		return total;
	}

	public static String city() {
		return "Ankara";
	}

}
