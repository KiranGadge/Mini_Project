package com.model;

public class Book_register {

	private int Issue_id;
	private int Member_id;
	private int Book_id;
	private String Issue_date;
	private String Return_date;
	private int Fine;
	private char is_returned;

	public Book_register() {

	}

	public Book_register(int issue_id, int member_id, int book_id, String issue_date, String return_date, int fine,
			char is_returned) {
		super();
		Issue_id = issue_id;
		Member_id = member_id;
		Book_id = book_id;
		Issue_date = issue_date;
		Return_date = return_date;
		Fine = fine;
		this.is_returned = is_returned;
	}

	public int getIssue_id() {
		return Issue_id;
	}

	public void setIssue_id(int issue_id) {
		Issue_id = issue_id;
	}

	public int getMember_id() {
		return Member_id;
	}

	public void setMember_id(int member_id) {
		Member_id = member_id;
	}

	public int getBook_id() {
		return Book_id;
	}

	public void setBook_id(int book_id) {
		Book_id = book_id;
	}

	public String getIssue_date() {
		return Issue_date;
	}

	public void setIssue_date(String issue_date) {
		Issue_date = issue_date;
	}

	public String getReturn_date() {
		return Return_date;
	}

	public void setReturn_date(String return_date) {
		Return_date = return_date;
	}

	public int getFine() {
		return Fine;
	}

	public void setFine(int fine) {
		Fine = fine;
	}

	public char getIs_returned() {
		return is_returned;
	}

	public void setIs_returned(char is_returned) {
		this.is_returned = is_returned;
	}

	public String toString() {
		return "Book_register has--> Issue_id=" + Issue_id + ", Member_id=" + Member_id + ", Book_id=" + Book_id
				+ ", Issue_date=" + Issue_date + ", Return_date=" + Return_date + ", Fine=" + Fine + ", is_returned="
				+ is_returned;
	}

}
