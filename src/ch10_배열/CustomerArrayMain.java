package ch10_배열;

public class CustomerArrayMain {

	public static void main(String[] args) {
		Customer[] customers = new Customer[10];  // 배열은 담을 수 있는 공간 10개를 만듬, 변수의 묶음이 배열
		
		customers[0] = new Customer("송유나", "Gold");
		customers[1] = new Customer("이설아", "Silver");
		customers[2] = new Customer("장유진", "Vip");
		
		for(int i = 0; i < customers.length; i++) {
			if(customers[i] == null) {
				continue;
			}
			customers[i].showInfo();
		}
		
//		customer1.showInfo();
//		customer2.showInfo();
//		customer3.showInfo();
	}

}
