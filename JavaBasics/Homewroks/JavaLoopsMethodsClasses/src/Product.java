//Create the class Product with its data-members, properties, getters, setters and constructor
public class Product implements Comparable<Product>{
	
	private String name;
	private double price;
	
	public String getName(){
		return name;
	}
	
	public double getPrice(){
		return price;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	 public int compareTo(Product product) {
	    double price = product.getPrice();
		  if (this.price > price) {
		         return 1;
		  } else if (this.price == price) {
		        return 0;
		  } else {
		        return -1;
		  }
	  } 		
}
