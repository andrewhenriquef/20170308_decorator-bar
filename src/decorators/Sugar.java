package decorators;

import beverages.Beverage;

public class Sugar extends BeverageDecorator{

	public Sugar(Beverage beverage){
		this.beverage = beverage; 
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Açúcar";
	}

	public float getPrice() {
		return beverage.getPrice() + 0.50f;
	}
}