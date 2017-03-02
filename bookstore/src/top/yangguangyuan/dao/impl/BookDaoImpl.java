package top.yangguangyuan.dao.impl;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.sun.org.apache.bcel.internal.generic.NEW;

import top.yangguangyuan.bean.Book;
import top.yangguangyuan.dao.BookDao;
import top.yangguangyuan.utils.MyDBUtils;

public class BookDaoImpl implements BookDao {

	QueryRunner runner = new QueryRunner(MyDBUtils.getDataSource());
	@Override
	public List<Book> findAllBook() {
		String sql = "select * from book";
		try {
			List<Book> list = runner.query(sql, new BeanListHandler<Book>(Book.class));
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@Override
	public Book findBookByBid(String bid) {
		String sql="select * from book where book.bid=?";
		try {
			Book query = runner.query(sql, new BeanHandler<Book>(Book.class),bid);
			return query;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
}
