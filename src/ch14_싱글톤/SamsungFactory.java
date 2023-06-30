package ch14_싱글톤;

public class SamsungFactory {
	
	public Galaxy produce(String model) {
		System.out.println(Samsung.getInstance().getCompanyName() + "에서 스마트폰을 생산합니다.");
		int newSerialNumaber = Samsung.getInstance().getAutoIncrementSerialNumber() + 1;
		Samsung.getInstance().setAutoIncrementSerialNumber(newSerialNumaber);
		return new Galaxy(newSerialNumaber, model);
	}
	
	public void showCompanyName() {
		System.out.println("회사명: " + Samsung.getInstance().getCompanyName());
	}

}
