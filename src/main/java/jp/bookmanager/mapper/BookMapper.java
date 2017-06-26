package jp.bookmanager.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import jp.bookmanager.model.Book;

public class BookMapper implements RowMapper {
	
	public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
		Book book = new Book();
		
		book.setId(rs.getInt("id"));
		book.setName(rs.getString("name"));
		book.setPublisher(rs.getString("publisher"));
		book.setPage(rs.getInt("page"));
		
		return book;
	}

	@Override
	public int[] getRowsForPaths(TreePath[] path) {
		// TODO Auto-generated method stub
		return null;
	}
}
