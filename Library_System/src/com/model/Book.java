package com.model;

public class Book {

	private int Book_id;
	private String Book_name;
	private String Catagory;
	private int Price;

	
public	Book()
	{
		
	}


public Book(int book_id, String book_name, String catagory, int price) {
	super();
	Book_id = book_id;
	Book_name = book_name;
	Catagory = catagory;
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


public String getCatagory() {
	return Catagory;
}


public void setCatagory(String catagory) {
	Catagory = catagory;
}


public int getPrice() {
	return Price;
}


public void setPrice(int price) {
	Price = price;
}


@Override
public String toString() {
	return "Book has--> Book_id=" + Book_id + ", Book_name=" + Book_name + ", Catagory=" + Catagory + ", Price=" + Price;
}


}
