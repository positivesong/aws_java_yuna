package ch12_상속;

public class Computer extends Product {  // extends 확장해서 Product 자료를 합치겠다는 뜻

	private String type;
	
//	public Computer() {
//		super("", 10);
//		System.out.println("컴퓨터 객체 생성");
//	}
	
	
	public Computer(String model, int price) {  // 생성자(ProductMain)에서 생성할때 고를 수 있다.
		super(model, price);
	}
	
	public Computer(String model, int price, String type) {  // 생성자(ProductMain)에서 생성할때 고를 수 있다.
		super(model, price);
		this.type = type;
	}

	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}

}
