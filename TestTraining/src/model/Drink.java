package model;

public class Drink extends Product implements CalculatePriceProduct  {

	public final static int LEMONADE = 1;
	public final static int WATER=2;
	public final static int SODA = 3;
	
	public final static double IMPUESTO = 0.04;
	
	private int typeDrink;
	public Drink(String nameProduct, double price,int typeDrink) {
		super(nameProduct, price);
		// TODO Auto-generated constructor stub
		this.typeDrink=typeDrink;
	}
	


	public int getTypeDrink() {
		return typeDrink;
	}

	public void setTypeDrink(int typeDrink) {
		this.typeDrink = typeDrink;
	}



	@Override
	public double calculatePrice() {
		double price=0;

		if(typeDrink==1) {
			price= (this.getPrice()*IMPUESTO);
		}else{
			price=  this.getPrice();
		}
		// TODO Auto-generated method stub
		return price;
	}

	

	
	
	

}
