package beverages;

public abstract class Beverage {

	protected String description = "bebida qualquer";
	
	public String getDescription(){
		return this.description;
	}
	
	public abstract float getPrice();
	
}
