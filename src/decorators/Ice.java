package decorators;

import beverages.Beverage;

public class Ice extends BeverageDecorator{

	public Ice(Beverage beverage){
		this.beverage = beverage; 
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Gelo";
	}

	public float getPrice() {
		return beverage.getPrice() + 0.25f;
	}
}