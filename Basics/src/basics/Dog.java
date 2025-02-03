package basics;

public class Dog extends Animal {
	
	private  String earShape ; 
	private String tailShape ;
	
	public Dog() {
		// TODO Auto-generated constructor stub
		super("Mutt", "Big", 50);
		this.earShape=earShape;
		this.tailShape=tailShape;
	}
	
	public Dog(String type, String size, double weight, String earShape , String tailShape) {
		super(type, size, weight);
		// TODO Auto-generated constructor stub
		this.earShape=earShape;
		this.tailShape=tailShape;
	}








	@Override
	public String toString() {
		return "Dog ";
	}
	
	
	

}
