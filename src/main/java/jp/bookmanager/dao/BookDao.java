package jp.bookmanager.dao;

import java.util.List;

import javax.sql.DataSource;

import jp.bookmanager.model.Book;

public interface BookDao {

	// initialize database resources connection
	public void setDataSource(DataSource ds);
	
	// create a record in the book table
	public void create(String name, String publisher, Integer page);
	
	// list down a record from the book table
	public Book getBook(Integer id);
	
	// list down all records from the book table
	public List<Book> listBooks();
	
	// this is the method to be used to update a record into the Book table
	public void update(Integer id, String name, String publisher, Integer page);
	
	// This method is used to delete a record from the Book table corresponding to a passed book id
	public void delete(Integer id);
	
	public List<Book> list();
}
