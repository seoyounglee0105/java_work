package ex04;

public class BuyDTO {

	// 테이블 구조 확인하고 멤버변수 선언하기
	private String userName;
	private String productName;
	private int price;
	private int amount;
	
	// 생성자
	public BuyDTO(String userName, String productName, int price, int amount) {
		super();
		this.userName = userName;
		this.productName = productName;
		this.price = price;
		this.amount = amount;
	}

	// get 메서드 
	public String getUserName() {
		return userName;
	}

	public String getProductName() {
		return productName;
	}

	public int getPrice() {
		return price;
	}

	public int getAmount() {
		return amount;
	}
	
}
