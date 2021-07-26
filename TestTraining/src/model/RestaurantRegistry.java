package model;

public class RestaurantRegistry {
	
	public RestaurantRegistry() {
		
	}
	
	public Restaurant registry(String nameRestaurant, String idRestaurant) {
		Restaurant newRestaurant = new Restaurant(nameRestaurant, idRestaurant);
		return newRestaurant;
	}
}
