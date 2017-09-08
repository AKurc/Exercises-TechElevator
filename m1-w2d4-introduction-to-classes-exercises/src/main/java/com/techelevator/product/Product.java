package com.techelevator.product;

public class Product {
	//private instance variables
	private String name;
	private double price;
	private double weightInOunces;
	
	//default constructor-- don't need to really add this since it's a default
	public Product() {
		
	}
	//computer generated getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getWeightInOunces() {
		return weightInOunces;
	}

	public void setWeightInOunces(double weightInOunces) {
		this.weightInOunces = weightInOunces;
	}
}
