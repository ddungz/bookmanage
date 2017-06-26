package jp.bookmanager.dao;

import java.util.List;

import javax.sql.DataSource;

import jp.bookmanager.model.Book;

public class BookDaoImpl implements BookDao {

	@Override
	public void setDataSource(DataSource ds) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void create(String name, String publisher, Integer page) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Book getBook(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> listBooks() {
		// TODO Auto-generated method stub
		String SQL = "SELECT * FROM book b";
		
		// query for book list
		//List<String> list = this.getJdbcTemplate().queryForList(SQL);
		return null;
	}

	@Override
	public void update(Integer id, String name, String publisher, Integer page) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Book> list() {
		// TODO Auto-generated method stub
		return null;
	}

}
