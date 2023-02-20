package ch03;

public class Customer {

	private int id;
	private String name;
	private String email;
	private String phone;
	private Coffee[] orders;
	
	public Customer(int id, String name, String email, String phone, Coffee[] orders) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.orders = orders;
	}
	
	
	
}
