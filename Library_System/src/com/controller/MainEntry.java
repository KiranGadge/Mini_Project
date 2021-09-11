package com.controller;

import java.sql.SQLException;
import java.util.Scanner;

import com.dao.BookDao_imp;
import com.dao.Book_registerDao_imp;
import com.dao.MemberDao_imp;
import com.model.Book;
import com.model.Book_register;
import com.model.Member;

public class MainEntry {

	public static void main(String[] args) throws SQLException {

		Scanner scanner = new Scanner(System.in);
		System.out.println("***************Welcome to Library System***************");
		do {
			System.out.println("Which operation do you want to perform??");
			System.out.println(
					"1.-> Add book \n2.-> Remove book\n3.-> update category of book\n4.-> Update price of book \n"
							+ "5.-> Search book\n6.-> Add member\n7.-> Remove member\n8.-> Update member \n9.-> Issue book\n10.-> Display member record\n"
							+ "11.-> Calculate fine\n12.-> Exit");
			int choice = scanner.nextInt();
			int status = 0;
			BookDao_imp bookDao_imp = new BookDao_imp();
			MemberDao_imp memberDao_imp = new MemberDao_imp();
			Book_registerDao_imp book_registerDao_imp = new Book_registerDao_imp();
			switch (choice) {

			case 1:
				status = 0;
				System.out.println("Enter book details to add");
				System.out.println("Book name:-");
				String book_name = scanner.next();
				System.out.println("1.Novel   2.Tale   3.Historic   4.Biography ");
				System.out.println("Category_id:- ");
				int category_id = scanner.nextInt();
				System.out.println("Price:- ");
				int price = scanner.nextInt();
				System.out.println("Author_id:- ");
				System.out.println("1.R.K.Narayan\n2.M.Premchand\n3.M.Malgaonkar\n4.Romila Thapa\n5.Vikram Seth");
				int auhtor_id = scanner.nextInt();

				Book book = new Book(book_name, category_id, price, auhtor_id);
				status = bookDao_imp.addBook(book);

				if (status > 0) {
					System.out.println("Book added successfully");
				} else {
					System.out.println("Unable to add book");
				}
				break;

			case 2:
				status = 0;
				System.out.println("Enter book id to delete record:- ");
				int bookId = scanner.nextInt();
				status = bookDao_imp.removeBook(bookId);
				if (status > 0) {
					System.out.println("Record of book deleted successfully");
				} else {
					System.out.println("Unable to delete record of book");
				}
				break;

			case 3:
				status = 0;
				System.out.println("Enter book_name whose category_id you want to change:- ");
				String book_nm = scanner.next();
				int cate_id = scanner.nextInt();
				status = bookDao_imp.updateCategary_id(book_nm, cate_id);
				if (status > 0) {
					System.out.println("Record of book updated successfully");
				} else {
					System.out.println("Unable to update record of book");
				}
				break;
			case 4:
				status = 0;
				System.out.println("Enter book_id whose price you want to change:- ");
				int book_id = scanner.nextInt();
				int price1 = scanner.nextInt();
				status = bookDao_imp.updatePrice(book_id, price1);
				if (status > 0) {
					System.out.println("Record of book updated successfully");
				} else {
					System.out.println("Unable to update record of book");
				}
				break;

			case 5:
				String data = null;
				System.out.println(
						"By which reference you want to-->\n1.search by category\n2.seach by author\n3.search by name");
				System.out.println("Enter your choice:-");
				int ch = scanner.nextInt();
				if (ch == 1) {

					System.out.println("Enter category_id to search books:-");
					int b_cate = scanner.nextInt();
					data = bookDao_imp.search_bookby_category_id(b_cate);

				} else if (ch == 2) {

					System.out.println("Enter author_id to search book:-");
					int a_id = scanner.nextInt();
					data = bookDao_imp.search_bookby_author_id(a_id);
				} else if (ch == 3) {

					System.out.println("Enter book name to search record:- ");
					String b_name = scanner.next();
					data = bookDao_imp.search_bookby_name(b_name);
				}

				if (data != null && data != "") {
					System.out.println("Record of book searched successfully");
					System.out.println(data);

				} else {
					System.out.println("Unable to search record of book");
				}
				break;

			case 6:
				status = 0;
				System.out.println("Enter member details to add");
				System.out.println("Member_id:- ");
				int member_Id = scanner.nextInt();
				System.out.println("Member_name:- ");
				String member_name = scanner.next();
				System.out.println("Mobile:- ");
				long mobile = scanner.nextLong();
				System.out.println("Address:- ");
				String address = scanner.next();

				Member member = new Member(member_Id, member_name, mobile, address);
				status = memberDao_imp.addmember(member);
				if (status > 0) {
					System.out.println("Record of member added successfully");
				} else {
					System.out.println("Unable to add record of member");
				}
				break;
			case 7:
				status = 0;
				System.out.println("Enter member id to delete the record:- ");
				int m_id = scanner.nextInt();
				status = memberDao_imp.removemember(m_id);

				if (status > 0) {
					System.out.println("Record of member deleted successfully");
				} else {
					System.out.println("Unable to delete record of member");
				}
				break;
			case 8:
				status = 0;
				System.out.println("Enter member name whose address you want to update:-");

				String membername = scanner.next();
				String addr = scanner.next();
				status = memberDao_imp.updatemember_byname(membername, addr);
				if (status > 0) {
					System.out.println("Record of member updated successfully");
				} else {
					System.out.println("Unable to update record of member");
				}
				break;

			case 9:
				status = 0;
				System.out.println("Enter details to issue book:- ");
				System.out.println("Issue_id:- ");
				int issue_id = scanner.nextInt();
				System.out.println("Member_id:- ");
				int member_id = scanner.nextInt();
				System.out.println("Book_id:- ");
				int bookk_id = scanner.nextInt();
				System.out.println("Issue_date:- ");
				String issue_date = scanner.next();
				System.out.println("Return_date:- ");
				String return_date = scanner.next();

				Book_register book_register = new Book_register();
				book_register.setIssue_id(issue_id);
				book_register.setMember_id(member_id);
				book_register.setBook_id(bookk_id);
				book_register.setIssue_date(issue_date);
				book_register.setReturn_date(return_date);

				status = book_registerDao_imp.issuebook(book_register);

				if (status > 0) {
					System.out.println("Book added successfully");
				} else {
					System.out.println("Unable to add book");
				}
				break;

			case 10:

				System.out.println("Enter member id to show record:- ");
				int mid = scanner.nextInt();

				String info = book_registerDao_imp.returnbook(mid);

				if (info != null) {
					System.out.println("Record of member displayed successfully");
					System.out.println(info);

				} else {
					System.out.println("Member id is not valid");
				}
				break;
			case 11:
				status = 0;
				System.out.println("Enter no of days extended to return book:- ");
				int n = scanner.nextInt();
				status = book_registerDao_imp.calulatefine(n);
				break;
			case 12:
				System.out.println("Thank You!!");
				break;
			}

			System.out.println("Do you want to continue??(y/n)");
			char ans = scanner.next().charAt(0);
			if (ans == 'n' || ans == 'N')
				break;

		} while (true);
		scanner.close();
	}

}
