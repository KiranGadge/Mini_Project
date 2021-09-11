package com.model;

public class Book {

	private int Book_id;
	private String Book_name;
	private int Catagory_id;
	private int Author_id;
	private int Price;

	public Book() {

	}

	public Book(int book_id, String book_name, int catagory_id, int author_id, int price) {
		super();
		Book_id = book_id;
		Book_name = book_name;
		Catagory_id = catagory_id;
		Author_id = author_id;
		Price = price;
	}

	public Book(String book_name, int catagory_id, int author_id, int price) {
		super();
		Book_name = book_name;
		Catagory_id = catagory_id;
		Author_id = author_id;
		Price = price;
	}

	public int getBook_id() {
		return Book_id;
	}

	public void setBook_id(int book_id) {
		Book_id = book_id;
	}

	public String getBook_name() {
		return Book_name;
	}

	public void setBook_name(String book_name) {
		Book_name = book_name;
	}

	public int getCatagory_id() {
		return Catagory_id;
	}

	public void setCatagory_id(int catagory_id) {
		Catagory_id = catagory_id;
	}

	public int getAuthor_id() {
		return Author_id;
	}

	public void setAuthor_id(int author_id) {
		Author_id = author_id;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public String toString() {
		return "Book has--> Book_id=" + Book_id + ", Book_name=" + Book_name + ", Catagory_id=" + Catagory_id
				+ ", Author_id=" + Author_id + ", Price=" + Price;
	}

}
