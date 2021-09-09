package com.model;

public class Categary {

	private int Categary_id;
	private String Categary_type;
	
	public Categary()
	{
		
	}

	public Categary(int categary_id, String categary_type) {
		super();
		Categary_id = categary_id;
		Categary_type = categary_type;
	}

	public int getCategary_id() {
		return Categary_id;
	}

	public void setCategary_id(int categary_id) {
		Categary_id = categary_id;
	}

	public String getCategary_type() {
		return Categary_type;
	}

	public void setCategary_type(String categary_type) {
		Categary_type = categary_type;
	}

	@Override
	public String toString() {
		return "Categary has--> Categary_id=" + Categary_id + ", Categary_type=" + Categary_type ;
	}
	
	
}
