package com.techelevator.project;

import java.util.List;

public interface CardDao {
	public List<Category> getAllCategories();
	public List<Card> getAllCards(Long categoryId);
	public Card getCardById(Long id);
	public Category getCategoryById(Long id);
}
