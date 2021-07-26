package model;

public class FastFoodRegistry {

	
	public FastFoodRegistry() {
		
	}
	

	public FastFood registerFaastFood(String nameProduct, double price,int typeFastFood) {
		FastFood newFastFood = new FastFood(nameProduct, price, typeFastFood);
		return newFastFood;
	}
	
	
	
	
}
