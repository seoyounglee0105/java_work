package ex04;

public class BuyDTO {

	private String userName;
	private String productName;
	private int price;
	private int amount;
	
	public BuyDTO(String userName, String productName, int price, int amount) {
		super();
		this.userName = userName;
		this.productName = productName;
		this.price = price;
		this.amount = amount;
	}

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
