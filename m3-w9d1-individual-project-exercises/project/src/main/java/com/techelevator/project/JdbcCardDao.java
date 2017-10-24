package com.techelevator.project;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;



@Component
public class JdbcCardDao implements CardDao{

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public JdbcCardDao(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	@Override
	public List<Category> getAllCategories() {
		List<Category> allCategories = new ArrayList<>();
		String sqlSelectAllCategories = "SELECT * FROM categories";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectAllCategories);
		while(results.next()) {
			allCategories.add(mapRowToCategories(results));
		}
		return allCategories;
	}

	private Category mapRowToCategories(SqlRowSet row) {
		Category category = new Category();
		category.setId(row.getLong("id"));
		category.setName(row.getString("name"));
		
		return category;
	}

	@Override
	public List<Card> getAllCards(Long categoryId) {
		List<Card> allCards = new ArrayList<>();
		String sqlSelectAllCards = "SELECT * FROM cards WHERE category_id=?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectAllCards, categoryId);
		while(results.next()) {
			allCards.add(mapRowToCard(results));
		}
		return allCards;
	}

	@Override
	public Card getCardById(Long id) {
		Card card = null;
		String sqlSelectCardById = "SELECT * FROM cards WHERE id = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectCardById, id);
		if(results.next()) {
			card = mapRowToCard(results);
		}
		return card;
	}
	@Override
	public Category getCategoryById(Long id) {
		Category category = null;
		String sqlSelectCategoryById = "SELECT * FROM categories WHERE id = ?";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectCategoryById, id);
		if(results.next()) {
			category = mapRowToCategories(results);
		}
		return category;
	}

	private Card mapRowToCard(SqlRowSet row) {
		Card card = new Card();
		card.setId(row.getLong("id"));
		card.setCardName(row.getString("card_name"));
		BigDecimal price = (row.getBigDecimal("price"));
		card.setDescriptionText(row.getString("description"));
		card.setPrice(price);
		card.setImage(row.getString("image"));
		card.setCategoryId(row.getLong("category_id"));
		return card;
	}

}
