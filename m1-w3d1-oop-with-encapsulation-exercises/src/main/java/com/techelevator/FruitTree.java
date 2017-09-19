package com.techelevator;

public class FruitTree {
	public String typeOfFruit;
	public int piecesOfFruitLeft;
	
	public FruitTree(String typeOfFruit, int startingPiecesOfFruit) {
		this.typeOfFruit = typeOfFruit;
		this.piecesOfFruitLeft = startingPiecesOfFruit;
	}
	
	public boolean pickFruit(int numberOfPiecesToRemove) {
		if(piecesOfFruitLeft >= numberOfPiecesToRemove) {
			piecesOfFruitLeft -= numberOfPiecesToRemove;
			return true;
		}
	
		return false;
			
	}
	
	public String getTypeOfFruit() {
		return typeOfFruit;
	}

	public int getPiecesOfFruitLeft() {
		return piecesOfFruitLeft;
	}

}