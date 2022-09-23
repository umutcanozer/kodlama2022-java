
public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager; // = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager = customerManager2; // referans numaraları eşitleniyor; stackteki cm ve cm2, heapteki aynı
											// referansa gidiyolar
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();

		// value type'larında her şey stackte gerçekleşir.
		int number1 = 10;
		int number2 = 20;
		number2 = number1;
		number1 = 30;
		System.out.println(number2);

		// arrays reference type'tır.
		int numbers1[] = new int[] { 1, 2, 3 };
		int numbers2[] = new int[] { 4, 5, 6 };
		numbers2 = numbers1;
		numbers1[0] = 10;
		System.out.println(numbers2[0]);
	}
}

//claslarla gruplama yapıyoruz, farklı operasyonları grupluyor.
//class = reference type