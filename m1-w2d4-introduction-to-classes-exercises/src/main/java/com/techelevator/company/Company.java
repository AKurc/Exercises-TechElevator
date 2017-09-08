package com.techelevator.company;

public class Company {

	//private instance variables
	private String name;
	private int numberOfEmployees;
	private double revenue;
	private double expenses;
	
	//default constructor-- yes I know I don't need to put it in the code
	public Company() {
		
	}
	//methods
	
	
	public String getCompanySize() {
		if(numberOfEmployees <= 50) {
			return "small";
		} else if(numberOfEmployees >=51 && numberOfEmployees <=250) {
			return "medium";
		} else if(numberOfEmployees >= 251) {
			return "large";
		}
		return "numberOfEmployees";
	}
	public double getProfit() {
		return revenue - expenses;
	}
	
	
	
	
	//computer generated getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	public double getRevenue() {
		return revenue;
	}

	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}

	public double getExpenses() {
		return expenses;
	}

	public void setExpenses(double expenses) {
		this.expenses = expenses;
	}
	

	
}
