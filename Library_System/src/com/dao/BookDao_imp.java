package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.configuration.DBConnect;
import com.model.Book;

public class BookDao_imp implements BookDao {

	public int addBook(Book b) {
		int status = 0;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = DBConnect.getConnection();
			preparedStatement = connection.prepareStatement("insert into book values (?,?,?,?,?)");
			preparedStatement.setInt(1, b.getBook_id());
			preparedStatement.setString(2, b.getBook_name());
			preparedStatement.setInt(3, b.getCatagory_id());
			preparedStatement.setInt(4, b.getAuthor_id());
			preparedStatement.setInt(5, b.getPrice());

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

	public int removeBook(int book_id) {
		int status = 0;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		try {
			connection = DBConnect.getConnection();
			preparedStatement = connection.prepareStatement("delete from book where book_id =?");
			preparedStatement.setInt(1, book_id);

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

	public int updatePrice(int book_id, int price1) {
		int status = 0;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		String sql = "update Book set price=? where book_id=?";
		try {
			preparedStatement = DBConnect.getConnection().prepareStatement(sql);
			preparedStatement.setInt(1, price1);
			preparedStatement.setInt(2, book_id);
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

	public int updateCategary_id(String book_nm, int cate_id) {
		int status = 0;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		String sql = "update Book set category_id=? where book_name=?";
		try {
			preparedStatement = DBConnect.getConnection().prepareStatement(sql);
			preparedStatement.setInt(1, cate_id);
			preparedStatement.setString(2, book_nm);
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

	public String search_bookby_name(String book_name) {
		ResultSet status = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		String output = null;
		try {
			connection = DBConnect.getConnection();
			preparedStatement = connection.prepareStatement("select * from book where book_name=?");
			preparedStatement.setString(1, book_name);

			status = preparedStatement.executeQuery();
			status.next();

			output = "book_id:- " + status.getInt(1) + "\n book_name:- " + status.getString(2) + "\n book_category_id"
					+ status.getInt(3) + "\n book_author_id:- " + status.getInt(4) + "\n book_price:- "
					+ status.getInt(5);

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

	public String search_bookby_author_id(int author_id) {
		ResultSet status = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		String output = "";
		try {
			connection = DBConnect.getConnection();
			preparedStatement = connection.prepareStatement("select * from book where author_id=?");
			preparedStatement.setInt(1, author_id);
			status = preparedStatement.executeQuery();

			while (status.next()) {
				output = output + " book_id:- " + status.getInt(1) + "\n book_name:- " + status.getString(2)
						+ "\n book_category_id" + status.getInt(3) + "\n book_author_id:- " + status.getInt(4)
						+ "\n book_price:- " + status.getInt(5) + " \n";
			}

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

	public String search_bookby_category_id(int category_id) {

		ResultSet status = null;
		Connection connection = null;
		PreparedStatement preparedStatement = null;
		String output = null;
		try {
			connection = DBConnect.getConnection();
			preparedStatement = connection.prepareStatement("select * from book where category_id=?");
			preparedStatement.setInt(1, category_id);

			status = preparedStatement.executeQuery();
			status.next();

			output = " book_id:- " + status.getInt(1) + "\n book_name:- " + status.getString(2) + "\n book_category_id"
					+ status.getInt(3) + "\n book_author_id:- " + status.getInt(4) + "\n book_price:- "
					+ status.getInt(5);

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

}
