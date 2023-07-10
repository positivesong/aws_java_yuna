package test;

public class Order {
	private int orderId;
	private String productName;
	private String consumerName;
	private int price;
	private int stock;
	
	public void showOrderInfo() {
		System.out.println("주문번호: " + orderId);
		System.out.println("상품명: " + productName);
		System.out.println("상품명: " + consumerName);
		System.out.println("상품명: " + price);
		System.out.println("상품명: " + stock);
	}
	
	public static Order builder() {
		return new Order();
	}
}
