package ch02;

public class Address {

	private String street;
	private String city;
	private String state;
	private String zip;
	
	public Address(String street, String city, String state, String zip) {
		super();
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}
	
	public String getStreet() {
		return street;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZip() {
		return zip;
	}

	// address의 모든 멤버변수 가져오기
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}


	
	
	
}
