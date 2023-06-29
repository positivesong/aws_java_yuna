package ch10_배열;

public class CustomerArrayMain2 {

	public static void main(String[] args) {
		
		Customer[] customers = new Customer[10];
		
		for(int i = 0; i < customers.length; i++) {
			String[] ratings = new String[] { "Bronze", "Silver", "Gold", "Vip" };
			customers[i] = new Customer("송유나" + (i + 1), ratings[i % 4]);
		}
		
		for(int i = 0; i < customers.length; i++) {
			customers[i].showInfo();
		}
		
	}

}
