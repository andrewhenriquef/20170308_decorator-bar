package application;
import beverages.*;
import decorators.*;

public class Bar {

	public static void main(String[] args) {
		Bar bar = new Bar();
		
		Beverage rum = new Rum();
		bar.printBeverage(rum);
		
		Beverage sugarLiquor = new SugarcaneLiquor();
		bar.printBeverage(sugarLiquor);
		
		Beverage tequila = new Tequila();
		bar.printBeverage(tequila);
		
		Beverage vodka = new Vodka();
		bar.printBeverage(vodka);
		
		Beverage caipirinha = new SugarcaneLiquor();
		caipirinha = new Ice(caipirinha);
		caipirinha = new Lemon(caipirinha);
		caipirinha = new Sugar(caipirinha);
		
		bar.printBeverage(caipirinha);
	
	}
	
	public void printBeverage(Beverage beverage){
		System.out.println(beverage.getDescription() + " - R$ " + beverage.getPrice());
	}

}
