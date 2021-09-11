package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.configuration.DBConnect;
import com.model.Book_register;

public class Book_registerDao_imp implements Book_registerDao {

	public int issuebook(Book_register brd) {
		int status = 0;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = DBConnect.getConnection();
			preparedStatement = connection.prepareStatement(
					"insert into book_register (issue_id, member_id, book_id, issue_date, return_date) values (?,?,?,?,?)");
			preparedStatement.setInt(1, brd.getIssue_id());
			preparedStatement.setInt(2, brd.getMember_id());
			preparedStatement.setInt(3, brd.getBook_id());
			preparedStatement.setDate(4, java.sql.Date.valueOf(brd.getIssue_date()));
			preparedStatement.setDate(5, java.sql.Date.valueOf(brd.getReturn_date()));

			status = preparedStatement.executeUpdate();
		} catch (SQLException e) {

			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null)
					preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			try {
				if (connection != null)
					connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return status;
	}

	@Override
	public String returnbook(int mid) {
		ResultSet status = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		String output = null;
		try {
			connection = DBConnect.getConnection();
			preparedStatement = connection.prepareStatement("select * from book_register where member_id=?");
			preparedStatement.setInt(1, mid);

			status = preparedStatement.executeQuery();
			status.next();

			output = "Issue_id:- " + status.getInt(1) + "\nMember_id:- " + status.getInt(2) + "\nBook_id:- "
					+ status.getInt(3) + "\nIssue_date:- " + status.getDate(4) + "\nReturn_date:-" + status.getDate(5)
					+ "\nFine:- " + status.getInt(6) + "\nIs_returned:- " + status.getString(7);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null)
					preparedStatement.close();
				if (connection != null)
					connection.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return output;

	}

	public int calulatefine(int n) {
		int fine = 0;
		fine = n * 10;
		System.out.println("Total fine is:- " + fine + " RS.");
		return fine;
	}

}
