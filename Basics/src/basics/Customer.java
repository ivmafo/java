package basics;

public class Customer {
	private String name;
	private double credit_limit ; 
	private String email;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getCredit_limit() {
		return credit_limit;
	}
	public void setCredit_limit(double credit_limit) {
		this.credit_limit = credit_limit;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Customer() {
		super();
	}
	
	public Customer(String name, double credit_limit, String email) {
		super();
		this.name = name;
		this.credit_limit = credit_limit;
		this.email = email;
	}
	
	public Customer(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	
	
	
	
}
