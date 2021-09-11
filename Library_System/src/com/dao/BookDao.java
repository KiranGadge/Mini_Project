package com.dao;

import com.model.Book;

public interface BookDao {

	int addBook(Book b);

	int removeBook(int book_id);

	int updatePrice(int book_id, int price);

	int updateCategary_id(String book_nm, int cate_id);

	String search_bookby_name(String book_name);

	String search_bookby_author_id(int author_id);

	String search_bookby_category_id(int category_id);

}
