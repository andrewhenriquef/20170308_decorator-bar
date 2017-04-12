package decorators;

import beverages.Beverage;

public class Lemon extends BeverageDecorator{

	public Lemon(Beverage beverage){
		this.beverage = beverage; 
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Limão";
	}

	public float getPrice() {
		return beverage.getPrice() + 0.75f;
	}
}
