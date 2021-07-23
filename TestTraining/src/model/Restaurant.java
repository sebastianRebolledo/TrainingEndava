package model;

public class Restaurant {

    private String nameRestaurant;
    private String idRestaurant;
    
	public Restaurant(String nameRestaurant, String idRestaurant) {
		this.nameRestaurant = nameRestaurant;
		this.idRestaurant = idRestaurant;
	}

	public String getNameRestaurant() {
		return nameRestaurant;
	}

	public void setNameRestaurant(String nameRestaurant) {
		this.nameRestaurant = nameRestaurant;
	}

	public String getIdRestaurant() {
		return idRestaurant;
	}

	public void setIdRestaurant(String idRestaurant) {
		this.idRestaurant = idRestaurant;
	}
	
	

  
}
