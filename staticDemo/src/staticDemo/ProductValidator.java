package staticDemo;

public class ProductValidator {
	static {
		System.out.println("Static block launched");
	}
	public ProductValidator() {
		System.out.println("Launched"); //new'leyince çalışır
	}
	public static boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	public void anything() {
		
	}
	public static class AnotherClass { //inner class
		public static void delete() {
			
		}
	}
}
