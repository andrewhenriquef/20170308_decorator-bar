package decorators;
import beverages.Beverage;

public abstract class BeverageDecorator extends Beverage {

	public Beverage beverage;
	
	public abstract String getDescription();
	
}
