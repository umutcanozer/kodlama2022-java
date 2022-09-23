package inheritanceDemo;

public class Main {

	public static void main(String[] args) {
		KrediUI krediUI= new KrediUI();
		krediUI.krediCalculate(new OgretmenKrediManager());
		krediUI.krediCalculate(new TarimKrediManager());
		krediUI.krediCalculate(new AskerKrediManager());
		

	}

}
