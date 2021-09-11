package com.dao;

import com.model.Book_register;

public interface Book_registerDao {

	int issuebook(Book_register brd);

	String returnbook(int mid);

	int calulatefine(int n);
}
