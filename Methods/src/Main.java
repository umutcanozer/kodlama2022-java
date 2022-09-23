public class Main {

	public static void main(String[] args) {
		numberFinder();
		numberFinder();
		
	}
	
	public static void numberFinder() {
		int[] numbers = new int[] {1,2,5,7,9,0};
		int sfor=6;
		boolean exists=false;
		
		for(int number : numbers) {
			if(number==sfor) {
				exists=true;
				break;
			}
	
		}
		
		if(exists) {
			giveMessage("Number's available :"+sfor);
		}else {
			giveMessage("Number's not available :"+sfor);
		}
	}
	public static void giveMessage(String message) {
		System.out.println(message);
	}
}