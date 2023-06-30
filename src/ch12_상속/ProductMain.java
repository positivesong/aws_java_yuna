package ch12_상속;

public class ProductMain {

	public static void main(String[] args) {
		Computer computer = new Computer("삼성 컴퓨터", 1000, "데스크탑");  // Computer에 Product가 연결되어있음
		Clothes clothes = new Clothes("상의", 2000, "L", "black");
		
		Product product = new Product("상품", 1000);
		
		Computer computer2 = (Computer) computer;
		
		System.out.println(computer2.getType());
		
	}

}
