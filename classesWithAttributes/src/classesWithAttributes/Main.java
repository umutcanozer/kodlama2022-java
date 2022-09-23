package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1, "laptop", "MSI Laptop", 3000, 2, "black");

		/*
		 * Product product = new Product(); 
		 * product.setName("laptop"); 
		 * product.setId(1);
		 * product.setDescription("MSI Laptop"); 
		 * product.setPrice(5000);
		 * product.setStockAmount(3); overloading
		 */

		ProductManager productManager = new ProductManager();
		productManager.Add(product);

		System.out.println(product.getCode());

	}

}