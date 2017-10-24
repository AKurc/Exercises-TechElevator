package com.techelevator.project;

import java.math.BigDecimal;

public class Card {
	
	private Long id;
	private String cardName;
	private BigDecimal price;
	private String descriptionText;
	private Long categoryId;
	private String image;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String product) {
		this.cardName = product;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getDescriptionText() {
		return descriptionText;
	}
	public void setDescriptionText(String descriptionText) {
		this.descriptionText = descriptionText;
	}
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}

}
