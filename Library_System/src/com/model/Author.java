package com.model;

public class Author {

	private int Author_id;
	private String Author_name;

	
	public Author()
	{
		
	}


	public Author(int author_id, String author_name) {
		super();
		Author_id = author_id;
		Author_name = author_name;
	}


	public int getAuthor_id() {
		return Author_id;
	}


	public void setAuthor_id(int author_id) {
		Author_id = author_id;
	}


	public String getAuthor_name() {
		return Author_name;
	}


	public void setAuthor_name(String author_name) {
		Author_name = author_name;
	}


	@Override
	public String toString() {
		return "Author has--> Author_id=" + Author_id + ", Author_name=" + Author_name ;
	}
	
	
	
}
