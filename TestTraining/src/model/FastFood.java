package model;

import java.util.ArrayList;

public class FastFood extends Product implements CalculatePriceProduct{

	public static final int  HAMBURGUER=1;
	public static final int HOT_DOG=2;
	
	public static final double DESCUENTO = 3;

	private int typeFastFood;
	public FastFood(String nameProduct, double  price,int typeFastFood) {
		super(nameProduct, price);
		// TODO Auto-generated constructor stub
		this.typeFastFood=typeFastFood;
	}
	public int getTypeFastFood() {
		return typeFastFood;
	}
	public void setTypeFastFood(int typeFastFood) {
		this.typeFastFood = typeFastFood;
	}
	
	
	@Override
	public double calculatePrice() {
		double price=0;
		if(this.typeFastFood ==1) {
		price=this.getPrice() - DESCUENTO;
		}else {
		price= this.getPrice();
		}
		// TODO Auto-generated method stub
		return price;
	}
	

}
