package top.yangguangyuan.service;

import java.util.List;

import top.yangguangyuan.bean.Book;
import top.yangguangyuan.dao.BookDao;
import top.yangguangyuan.dao.impl.BookDaoImpl;

public class BookService {
	BookDao bookDao = new BookDaoImpl();
	public List<Book> findAllBook() {
		return bookDao.findAllBook();
	}
	public Book findBookByBid(String bid) {
		return bookDao.findBookByBid(bid);
	}
	
	public List<Book> listBook(String category){
		
		return bookDao.listBook(category);
	}
}
