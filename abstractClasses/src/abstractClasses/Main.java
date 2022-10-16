package abstractClasses;

public class Main {

	public static void main(String[] args) {
		WomanCalculator womanCalculator = new WomanCalculator();
		womanCalculator.calculate();
		womanCalculator.gameOver();

		// asbtractlar tek başına kullanılamaz, yapısal olarak classtan farkı yok

		GameCalculator gameCalculator = new OlderCalculator();
		gameCalculator.calculate();
	}

}
