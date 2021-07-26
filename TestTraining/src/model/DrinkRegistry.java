package model;

public class DrinkRegistry{

	
	public DrinkRegistry () {
		
	}
	
	public Drink registryDrink(String nameProduct,double price, int typeDrink) {
		Drink newDrink = new Drink(nameProduct, price, typeDrink);		
		return newDrink;
	}

}

	

	 

	
	


