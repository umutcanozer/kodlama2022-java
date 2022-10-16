package staticDemo;

public class ProductManager {
	public void add(Product product) {
		
		if(ProductValidator.isValid(product)) {
			System.out.println("Data added.");
		}else {
			System.out.println("Warning!");
		}
		
	}
}
