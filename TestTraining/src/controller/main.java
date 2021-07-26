package controller;

import java.util.ArrayList;

import model.DrinkRegistry;
import model.FastFood;
import model.FastFoodRegistry;
import model.Product;
import model.Restaurant;
import model.RestaurantRegistry;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RestaurantRegistry registerRestaurant = new RestaurantRegistry();
		FastFoodRegistry fastFoodRegistry = new FastFoodRegistry();
		DrinkRegistry diDrinkRegistry = new DrinkRegistry();

		ArrayList<Restaurant> listRestaurants = new ArrayList<>();
		ArrayList<Product> listProducts = new ArrayList<>();
		
		String nameRestaurant1 = "McDonalds";
		String idRestaurant1= "12345";
		
		String nameRestaurant2= "Mangao";
		String idRestaurant2= "3456";
	
		
		listRestaurants.add(registerRestaurant.registry(nameRestaurant1, idRestaurant1));
		listRestaurants.add(registerRestaurant.registry(nameRestaurant2, idRestaurant2));
		
		
		//////Create products
		listProducts.add(diDrinkRegistry.registryDrink("Limonada natural",3.000, 1));
		listProducts.add(diDrinkRegistry.registryDrink("Coca cola",3.800, 3));
		listProducts.add(fastFoodRegistry.registerFaastFood("hamburguesa Americana", 13.500, 1));
		listProducts.add(fastFoodRegistry.registerFaastFood("Hot dog farnces", 11.500,2));
		
	


		for (int i = 0; i <listRestaurants.size(); i++) {
			System.out.println(listRestaurants.get(i).getNameRestaurant());
		}
		System.out.println("\n");
		
		
		for (int i = 0; i <listProducts.size(); i++) {
			System.out.println("Name product: " + listProducts.get(i).getNameProduct() + " " );
		}
	

	}
	
	

}
