package top.yangguangyuan.dao;

import java.util.List;

import top.yangguangyuan.bean.Book;

public interface BookDao {

	List<Book> findAllBook();

	Book findBookByBid(String bid);

	List<Book> listBook(String category);

}
